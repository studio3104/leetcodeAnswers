impl Solution {
    pub fn is_valid(s: String) -> bool {
        let mut stack = Vec::new();

        for c in s.chars() {
            if c == '(' || c == '[' || c == '{' {
                stack.push(c);
                continue;
            }

            match stack.pop() {
                Some(prev) => {
                    if prev == '(' && c == ')' || prev == '[' && c == ']' || prev == '{' && c == '}' {
                        continue;
                    }
                    stack.push(prev);
                    stack.push(c);
                }
                None => stack.push(c)
            }
        }

        stack.is_empty()
    }
}

struct Solution {}

#[cfg(test)]
mod tests {
    use crate::Solution;

    fn test(s: String, expected: bool) {
        assert_eq!(Solution::is_valid(s), expected);
    }

    #[test]
    fn example1() {
        test("()".to_string(), true);
    }

    #[test]
    fn example2() {
        test("()[]{}".to_string(), true);
    }

    #[test]
    fn example3() {
        test("(]".to_string(), false);
    }

    #[test]
    fn example4() {
        test("([)]".to_string(), false);
    }

    #[test]
    fn example5() {
        test("{[]}".to_string(), true);
    }

    #[test]
    fn case89() {
        test("([}}])".to_string(), false);
    }
}
