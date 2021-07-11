var arr = new Int8Array();
var fs = require("fs");
function loadFile() {
  //  var text = fs.readFileSync("Day1_1.txt").toString('utf-8');
  var text = fs.readFileSync("main/resources/Day1.txt").toString('utf-8');
    arr = text.split("\n").map(Number);
}

loadFile();



 function addTwo(nums, target) {
    let  response =new Array();
    

    for(var x =0; x<nums.length; x++){

        var check= nums.slice(x+1);

        if  (check.includes(target-nums[x])){

             response.push(x);
            for (var y=x+1; y<nums.length; y++){

                if(nums[y]+nums[x]=== target){

                     response.push(y);
                   
        break;
                }
            }


             }



    }
    
    
   return response;
};

function day1(nums, target){
    var response;
    let  answer =new Array();
    for(var x =0; x<nums.length; x++){

        var check= nums.slice(x+1);

        if  (check.includes(target-nums[x])){

             answer.push(nums[x]);
             answer.push(target-nums[x])}
        }
         response =answer[0]* answer[1]
        return response;
        
             


}

function day1part2 (nums, target){
    for(var x =0; x<nums.length; x++)
    {
for(var y=x+1; y< nums.length; y++){
for(var z = x+2; z<nums.length; z++){
    if(nums[x]+nums[y]+nums[z]==target){
        return nums[x]*nums[y]*nums[z];
    }

}
     } 
    }
}
//To DO add solution with map 


var x =(addTwo(arr, 2020).toString());
var z = (day1part2(arr, 2020).toString());
var y= (day1(arr, 2020).toString());

fs.writeFile('main/java/Day1/Day1jsanswer.txt', y+" This is the answer for part 1 "+ "  this is answer for part 2 "+z,  function(err) {

   if (err) {
      return console.error(err);
   }
  
});