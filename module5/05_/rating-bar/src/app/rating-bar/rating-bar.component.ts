import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-rating-bar',
  templateUrl: './rating-bar.component.html',
  styleUrls: ['./rating-bar.component.css']
})
export class RatingBarComponent implements OnInit {
  arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  choose = 5;

  constructor() {
  }

  ngOnInit(): void {
  }

  // tslint:disable-next-line:variable-name
  getChoose(number: number) {
    this.choose = number + 1;
  }
}
