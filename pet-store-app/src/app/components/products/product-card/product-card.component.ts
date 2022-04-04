import { Component, OnInit, Input } from '@angular/core';
import {Product} from "../../../models/product";

@Component({
  selector: 'app-product-card',
  templateUrl: './product-card.component.html',
  styleUrls: ['./product-card.component.css']
})
export class ProductCardComponent implements OnInit {

  @Input() product: Product = {
    id: 1,
    name: 'Product',
    quantity: 0,
    price: 0.00,
    description: 'description',
    category: 'TOYS',
    petType: 'CAT'
  }

  constructor() { }

  ngOnInit(): void {
  }

}
