import {Component, OnInit, Input, OnDestroy, Output, EventEmitter} from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.scss']
})
export class CountdownTimerComponent implements OnInit, OnDestroy {

  constructor() {
  }

  private interValid = 0;
  message = '';
  remainingTime: number;
  @Input() seconds = 11;
  @Output() finish = new EventEmitter<string []>();

  ngOnDestroy() {
    this.clearTime();
  }

  ngOnInit() {
    this.reset();
    this.start();
  }

  clearTime(): void {
    clearInterval(this.interValid);
  }

  start() {
    this.countDown();
    if (this.remainingTime <= 0) {
      this.remainingTime = this.seconds;
    }
  }

  stop(): void {
    this.clearTime();
    this.message = `Còn lại : ${this.remainingTime} s`;
  }

  reset(): void {
    this.clearTime();
    this.remainingTime = this.seconds;
    this.message = `Click start để bắt đầu đếm ngược thời gian`;
    this.finish.emit([this.message, this.remainingTime + '']);
  }

  countDown(): void {
    this.clearTime();
    this.interValid = window.setInterval(() => {
      this.finish.emit([this.message, this.remainingTime + '']);
      this.remainingTime--;
      if (this.remainingTime === 0) {
        this.message = 'Hết giờ';
        this.clearTime();
        this.start();
      } else {
        this.message = `Còn lại : ${this.remainingTime} s`;
      }
    }, 1000);
  }
}
