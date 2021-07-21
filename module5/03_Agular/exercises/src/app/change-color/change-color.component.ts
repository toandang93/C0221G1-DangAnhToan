import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-change-color',
  templateUrl: './change-color.component.html',
  styleUrls: ['./change-color.component.css']
})
export class ChangeColorComponent implements OnInit {
  color = 'blue';
  constructor() { }

  ngOnInit(): void {
  }
  public changeColor(color): void {
    this.color = color.target.value;
}
}
