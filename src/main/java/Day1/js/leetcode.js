/** 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/

var twoSum =function (nums, target) {
    let  response =new Array();
    
   for(var x =0; x<nums.length; x++){

        var check= nums.slice(x+1);

        if  (check.includes(target-nums[x])){

             response.push(x);
             response.push(nums.array.indexOf(target-nums));
            for (var y=x+1; y<nums.length; y++){

                if(nums[y]+nums[x]=== target){

                     response.push(y);
                   
        break;
                }
            }


             }



    }

    var twoSum1 =function (nums, target) {

    var result = new Map(nums.map(key => [key.sid, key.name]));

    result.get
    console.dir(result);



    }





        }
