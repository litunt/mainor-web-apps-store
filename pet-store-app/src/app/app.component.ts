import { Component } from '@angular/core';
import { NgbNavItem } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  active = 1;
  title = 'pet-store-app';
}
