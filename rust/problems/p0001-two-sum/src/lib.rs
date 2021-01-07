use std::collections::HashMap;

pub struct Solution {}

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut index_of: HashMap<i32, i32> = HashMap::new();

        for (i, &n) in nums.iter().enumerate() {
            let complement = target - n;

            if let Some(&index) = index_of.get(&complement) {
                if index != i as i32 {
                    return vec![index, i as i32]
                }
            }

            index_of.insert(n, i as i32);
        }

        vec![]
    }
}

#[cfg(test)]
mod tests {
    use super::*;
    use parameterized::parameterized;

    #[parameterized(nums = {
        [2, 7, 11, 15].to_vec(),
        [3, 2, 4].to_vec(),
        [3, 3].to_vec(),
    }, target = {
        9,
        6,
        6,
    }, expected = {
        [0, 1].to_vec(),
        [1, 2].to_vec(),
        [0, 1].to_vec(),
    },
    )]
    fn test_two_sum(nums: Vec<i32>, target: i32, expected: Vec<i32>) {
        let actual: Vec<i32> = Solution::two_sum(nums, target);
        assert_eq!(expected, actual)
    }
}
