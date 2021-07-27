import {Component, EventEmitter, Input, Output} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  @Input() times = 11;
  timeLuonGiaKhanh = '';
  msgLuonGiaKhanh = '';

  khanhLuon(e: string[]) {
    this.timeLuonGiaKhanh = e[0];
    this.msgLuonGiaKhanh = 'con lai: ' + e[1] + 's';
  }
}
