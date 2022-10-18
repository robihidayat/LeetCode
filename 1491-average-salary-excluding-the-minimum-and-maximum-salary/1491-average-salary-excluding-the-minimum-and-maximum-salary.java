class Solution {
    public double average(int[] salary) {
        double max_salary = salary[0];
        double min_salary = salary[0];
        double sum = 0;
        for (int index = 0; index < salary.length; index ++) {
            if (max_salary > salary[index]){
                max_salary = salary[index];
            } 
            if (min_salary < salary[index]){
                min_salary = salary[index];
            } 
            sum = sum+salary[index];
        }
        
        return (sum-min_salary-max_salary)/(salary.length - 2);
    }
}