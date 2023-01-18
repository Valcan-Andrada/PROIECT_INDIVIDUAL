import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grades',
  templateUrl: './grades.component.html',
  styleUrls: ['./grades.component.css']
})
export class GradesComponent implements OnInit {
  placeSearch: any;

  constructor() { }

  ngOnInit(): void {
  }

  onSearch(placeSearch: any) {
console.log(placeSearch)
    this.placeSearch = ''
  }
}
