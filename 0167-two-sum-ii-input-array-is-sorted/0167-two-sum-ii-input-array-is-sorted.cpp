class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int left=0;
        int right=numbers.size()-1;
        vector<int> temp;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                temp.push_back(left+1);
                temp.push_back(right+1);
                break;
            }
            else if(numbers[left]+numbers[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        // for(int i=0;i<numbers.size()-1;i++){
        //     for(int j=i+1;j<numbers.size();j++){
        //         if(numbers[i]+numbers[j]==target){
        //             temp.push_back(i+1);
        //             temp.push_back(j+1);
        //         }
        //     }
        // }
        return temp;
    }
};