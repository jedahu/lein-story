# Lein Story

Run [Story][1] from Leiningen:

    lein plugin install lein-story 0.1.0-SNAPSHOT
    lein story [-v] [production]

`production` is an optional argument. If it is present, lein-story will
create a production project, otherwise it will create documentation.

`-v` is an optional argument. If it is present, lein-story will give verbose
output.

All configuration takes place in the project file under the `:story` key.

~~~~
:story
{:comment "//"             ; single line comment syntax
 :brushes ["jsBrush.js"]   ; a list of SyntaxHighlighter brush files to use
 :theme "shTheme.js"       ; the SyntaxHighlighter theme file to use
 :language "javascript"    ; the language to highlight for
 :stylesheet "nice.css"    ; a stylesheet to use
 :production "production"  ; the directory to use for production output
 :output "docs.html"       ; the file to write documentation to
 :files ["README.md" "project.clj"] } ; input files
~~~~

Default values:

~~~~
:production "production"
:output "doc.html"
:files ["project.clj"]
~~~~

Story loads a number of brushes automatically and comes with a default theme
and stylesheet. Story will make an effort to guess the correct language and
therefore the correct comment syntax and brush to use.

[1]: https://github.com/jedahu/story
[2]: http://jedahu.github.com/story
