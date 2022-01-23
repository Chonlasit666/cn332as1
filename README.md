# cn332as1_GeometryDisplayWithDatabase

ตัวโปรแกรมสามารถรับข้อมูลdatabaseได้โดยใช้ SQLITE เพื่อที่จะสามารถแสดงผลรูปทรงเรขาคณิตซึ่ง Support ทั้ง 3 เหลื่ยม 4 เหลื่ยม วงกลม วงรี และสามารถเปลื่ยนสีหรือสามารถหมุนรูปได้  ต้องทำการติดตั้ง External library 2 ตัวคือ awt-color-factory version 1.0.2 และ sqlite-jdbc-3.36.0.3 
ซึ่งหากรันด้วย vscode สามารถรันได้เลยครับแต่ถ้า IDE ตัวอื่นต้องติดตั้ง library ที่ผมได้กล่าวไปข้างต้น
ข้อมูล Database ที่ผมได้ใช้มีดังนี้
| object | location |   shape   |   param1  |  param2  |  param3 | degree |  color |
|:------:|:--------:|:---------:|:---------:|:--------:|:-------:|:------:|:------:|
|    1   |  150,150 |   square  |    200    |   null   |   null  |   60   |   red  |
|    2   |  500,200 |   circle  |    100    |   null   |   null  |    0   |  green |
|    3   |  100,200 | rectangle |     40    |    50    |   null  |    0   |  blue  |
|    4   |  850,300 |  triangle | (175,250) | (200,60) | (20,20) |    0   | yellow |
|    5   |  300,200 |  ellipse  |     40    |    50    |   null  |    0   |  pink  |

