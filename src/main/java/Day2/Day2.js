var passwords ;
var fs = require("fs");
function loadFile() {
  //  var text = fs.readFileSync("Day1_1.txt").toString('utf-8');
  var text = fs.readFileSync("resources/Day2.txt").toString('utf-8');
    passwords = text.split("\n");
}

loadFile();
var count =0;
var number =0;

function findBookings(passwords){

 for( const password of passwords){
   var arr = password.split(/[-: ]+/)
   var boundar =0;
jdfa;d{
}

   var min = arr[0];
   var max = arr[1];
   var character = arr[2]

   var passcode = arr[3]



   var answer = arr[3].length-(arr[3].replaceAll(arr[2], "")).length;
   if(passcode.charAt(max-1)===character){
     boundar++;

   }
   if(passcode.charAt(min-1)===character){
     boundar++
   }
   if(boundar===1){
     count++
   }
   if(answer<=max && answer>=min){
     number++;
   }


 }

 console.log(count +"answer to 2nd part")
 console.log("first part "+number)
}
findBookings(passwords);
fs.writeFile('answerday2.txt', count +" answer to 2nd part", (error) => {

     // In case of a error throw err exception.
     if (error) throw err;
 })
