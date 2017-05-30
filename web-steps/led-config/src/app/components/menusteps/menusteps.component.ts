import { Component, OnInit,Input } from '@angular/core';
import {ModelserviceService} from "../../services/modelservice.service";

@Component({
  selector: 'menusteps',
  templateUrl: './menusteps.component.html',
  styleUrls: ['./menusteps.component.css']
})
export class MenustepsComponent implements OnInit {

  @Input()
  titles:Array<string>;

  @Input()
  data:Array<Array<string>>;

  constructor(private modelService:ModelserviceService) {



  }

  ngOnInit() {
    this.modelService.getModels().subscribe((res:any) => {
        let serverresponse:any=res;

        console.info(serverresponse);
      }
      ,
      error=>console.info('error'));


  }


}
