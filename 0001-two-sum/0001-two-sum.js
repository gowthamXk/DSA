/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = new Map();
    let ans = [];
    for(let i = 0 ; i < nums.length ; i++){
        let comp = target - nums[i];
            if(map.has(comp)){
                ans.push(map.get(comp));
                ans.push(i);
                break;
            }
            else{
                map.set(nums[i],i)
            }

    }
    return ans;
};