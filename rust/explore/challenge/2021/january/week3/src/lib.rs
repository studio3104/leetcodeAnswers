#[derive(Debug, PartialEq, Eq)]
enum NestedInteger {
    Int(i32),
    List(Vec<NestedInteger>),
}

struct Solution {}

impl Solution {
    fn sum(nested_integer: &NestedInteger, depth: i32) -> i32 {
        match nested_integer {
            NestedInteger::Int(i) => i * depth,
            NestedInteger::List(l) => {
                l.iter().map(|n| Solution::sum(n, depth + 1)).sum()
            }
        }
    }

    pub fn depth_sum(nested_list: Vec<NestedInteger>) -> i32 {
        Solution::sum(&NestedInteger::List(nested_list), 0)
    }
}

#[cfg(test)]
mod tests {
    use crate::{NestedInteger, Solution};

    fn test(nested_list: Vec<NestedInteger>, expected: i32) {
        assert_eq!(Solution::depth_sum(nested_list), expected)
    }

    #[test]
    fn example1() {
        test(
            vec![
                NestedInteger::List(vec![
                    NestedInteger::Int(1),
                    NestedInteger::Int(1),
                ]),
                NestedInteger::Int(2),
                NestedInteger::List(vec![
                    NestedInteger::Int(1),
                    NestedInteger::Int(1),
                ]),
            ],
            10,
        )
    }

    #[test]
    fn example2() {
        test(
            vec![
                NestedInteger::Int(1),
                NestedInteger::List(vec![
                    NestedInteger::Int(4),
                    NestedInteger::List(vec![
                        NestedInteger::Int(6),
                    ])
                ])
            ],
            27,
        )
    }

    #[test]
    fn example3() {
        test(
            vec![
                NestedInteger::Int(0),
            ],
            0,
        )
    }
}
