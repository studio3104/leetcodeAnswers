use std::cmp::max;

pub struct Solution {}

impl Solution {
    pub fn max_sub_array(nums: Vec<i32>) -> i32 {
        let mut current = nums[0];
        let mut maximum = nums[0];

        for (i, n) in nums.iter().enumerate() {
            if i == 0 {
                continue;
            }

            current = max(*n, current + n);
            maximum = max(maximum, current);
        }

        maximum
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    use parameterized::parameterized;
    use parameterized::ide;

    mod solution_tests {
        use super::*;
        ide!();

        #[parameterized(
        nums = {
        [- 2, 1, - 3, 4, - 1, 2, 1, - 5, 4].to_vec(),
        [1].to_vec(),
        [0].to_vec(),
        [- 1].to_vec(),
        [- 2147483647].to_vec(),
        },
        expected = {
        6,
        1,
        0,
        - 1,
        - 2147483647,
        },
        )]
        fn test_solution(nums: Vec<i32>, expected: i32) {
            let actual: i32 = Solution::max_sub_array(nums);
            assert_eq!(expected, actual)
        }
    }
}
