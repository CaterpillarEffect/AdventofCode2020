var twoSum =function (nums, target) {
    let  response =new Array();
    console.log("in two sum")

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