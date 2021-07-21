import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
   result: number;
  constructor() { }

  ngOnInit(): void {
  }
  public calculator( num1: string, num2: string, cal: string): number {
    switch (cal){
      case '+':
        return this.result = parseInt(num1) + parseInt(num2);
      case '-':
        return this.result = parseInt(num1) - parseInt(num2);
      case '*':
        return this.result = parseInt(num1) * parseInt(num2);
      case '/':
        // tslint:disable-next-line:radix
        return this.result = parseInt(num1) / parseInt(num2);
    }
  }
}
