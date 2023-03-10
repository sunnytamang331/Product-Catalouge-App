import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-product-view',
  templateUrl: './product-view.component.html',
  styleUrls: ['./product-view.component.css']
})

export class ProductViewComponent implements OnInit {

  productList:any[]=[];
  constructor(private productServie: ProductService) { }

  ngOnInit(): void {
    this.productServie.getProducts().subscribe((result)=>{
      console.warn(result);
      this.productList=result;
    });
  }
}
