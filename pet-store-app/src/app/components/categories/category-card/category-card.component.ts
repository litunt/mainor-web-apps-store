import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-category-card',
  templateUrl: './category-card.component.html',
  styleUrls: ['./category-card.component.css']
})
export class CategoryCardComponent implements OnInit {

  @Input() category: any = {
    name: 'NAME',
    description: "name name",
    image: "https://material.angular.io/assets/img/examples/shiba2.jpg"
  };

  constructor() { }

  ngOnInit(): void {
  }

}
