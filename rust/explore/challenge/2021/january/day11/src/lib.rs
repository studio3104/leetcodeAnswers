impl Solution {
    pub fn merge(nums1: &mut Vec<i32>, m: i32, nums2: &mut Vec<i32>, n: i32) {
        let mut m = m as usize;
        let mut n = n as usize;

        for i in (0..m + n).rev() {
            nums1[i] = if m != 0 && (n == 0 || nums1[m - 1] > nums2[n - 1]) {
                m -= 1;
                nums1[m]
            } else {
                n -= 1;
                nums2[n]
            }
        }
    }
}

struct Solution {}

#[cfg(test)]
mod tests {
    use crate::Solution;

    fn test(mut nums1: Vec<i32>, m: i32, mut nums2: Vec<i32>, n: i32, expected: Vec<i32>) {
        Solution::merge(&mut nums1, m, &mut nums2, n);
        assert_eq!(nums1, expected);
    }

    #[test]
    fn example1() {
        test(
            vec![1, 2, 3, 0, 0, 0], 3,
            vec![2, 5, 6], 3,
            vec![1, 2, 2, 3, 5, 6],
        );
    }

    #[test]
    fn example2() {
        test(
            vec![1], 1,
            vec![], 0,
            vec![1],
        );
    }
}
