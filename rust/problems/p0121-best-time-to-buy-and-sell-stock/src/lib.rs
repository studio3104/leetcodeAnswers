use std::cmp::{max, min};

pub struct Solution {}

impl Solution {
    pub fn max_profit(prices: Vec<i32>) -> i32 {
        if prices.len() == 0 {
            return 0
        }

        let mut max_profit_so_far: i32 = 0;
        let mut min_price_so_far: i32 = prices[0];

        for &price in prices.iter() {
            max_profit_so_far = max(max_profit_so_far, price - min_price_so_far);
            min_price_so_far = min(min_price_so_far, price);
        }

        max_profit_so_far
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
        prices = {
        [7, 1, 5, 3, 6, 4].to_vec(),
        [7, 6, 4, 3, 1].to_vec(),
        },
        expected = {
        5,
        0,
        },
        )]
        fn test_solution(prices: Vec<i32>, expected: i32) {
            let actual: i32 = Solution::max_profit(prices);
            assert_eq!(expected, actual)
        }
    }
}
