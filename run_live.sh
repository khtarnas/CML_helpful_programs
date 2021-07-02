#!/bin/sh

cd ../../MTurk_Experiments/JOR
psiturk server on
text=$(psiturk debug -p)

cd ../../Useful_code/Replace_Text/
javac ReplaceText.java
text=$(java ReplaceText "$text" debug live)

echo "$text" | tail -n1 | pbcopy
