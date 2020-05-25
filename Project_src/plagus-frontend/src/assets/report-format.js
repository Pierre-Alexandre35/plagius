export const resultFormat =

{
  "lang": "PYTHON",
  "classCountList": [
    {
      "rule": "Or_test",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Arglist",
      "firstCount": 1,
      "secondCount": 1
    },
    {
      "rule": "Argument",
      "firstCount": 1,
      "secondCount": 1
    },
    {
      "rule": "Expr_stmt",
      "firstCount": 1,
      "secondCount": 2
    },
    {
      "rule": "Power",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Term",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Atom_expr",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Not_test",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Comparison",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Shift_expr",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "And_expr",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "And_test",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Small_stmt",
      "firstCount": 1,
      "secondCount": 2
    },
    {
      "rule": "Xor_expr",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Testlist_star_expr",
      "firstCount": 1,
      "secondCount": 3
    },
    {
      "rule": "Parameters",
      "firstCount": 1,
      "secondCount": 1
    },
    {
      "rule": "Compound_stmt",
      "firstCount": 1,
      "secondCount": 1
    },
    {
      "rule": "Test",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Atom",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Funcdef",
      "firstCount": 1,
      "secondCount": 1
    },
    {
      "rule": "Expr",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Arith_expr",
      "firstCount": 2,
      "secondCount": 4
    },
    {
      "rule": "Stmt",
      "firstCount": 2,
      "secondCount": 3
    },
    {
      "rule": "Trailer",
      "firstCount": 1,
      "secondCount": 1
    },
    {
      "rule": "Suite",
      "firstCount": 1,
      "secondCount": 1
    },
    {
      "rule": "File_input",
      "firstCount": 1,
      "secondCount": 1
    },
    {
      "rule": "Simple_stmt",
      "firstCount": 1,
      "secondCount": 2
    },
    {
      "rule": "Factor",
      "firstCount": 2,
      "secondCount": 4
    }
  ],
  "levFuncReports": {
    "functionMap": {
      "USER_TWO": [
        {
          "path": "/unit-tests/comment2.py",
          "lineNum": 4,
          "data": "defsam():\t\tprint(\"hello world\")))",
          "renamedString": "defvar0():\n\tvar1(\"hello world\")\n\n"
        }
      ],
      "USER_ONE": [
        {
          "path": "/unit-tests/comment1.py",
          "lineNum": 1,
          "data": "defmain():\t\tprint(\"hello world\")kk",
          "renamedString": "defvar0():\n\tvar1(\"hello world\")\n\n"
        }
      ]
    },
    "reportList": [
      {
        "distance": 0,
        "left": "defvar0():\n\tvar1(\"hello world\")\n\n",
        "right": "defvar0():\n\tvar1(\"hello world\")\n\n"
      }
    ]
  },
  "commentReport": {
    "lang": "PYTHON",
    "reports": [
      {
        "distance": 18,
        "left": "#this works#this doesn\u0027t work",
        "right": "#fuazs#this works"
      },
      {
        "distance": 23,
        "left": "#this works#this doesn\u0027t work",
        "right": "\t#an extra comment :)"
      }
    ]
  }
}