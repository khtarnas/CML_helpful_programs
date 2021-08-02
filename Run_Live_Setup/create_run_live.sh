#!/bin/sh

# Set Variables
LOCATION=$(pwd)
FILE=".bash_profile"
INPUT="run_live () {\n
LOC=$(pwd)\n
psiturk server on\n
text=\$(psiturk debug -p)\n
cd ~/.cml_files\n
javac ReplaceText.java\n
text=\$(java ReplaceText \"\$text\" debug live)\n
echo \"\$text\" | tail -n1 | pbcopy\n
cd $LOC\n
}"

# Check file and input alias
cd ~
if ! grep -q INPUT "$FILE"; then
  echo $INPUT >> $FILE
fi

# Move java function to appropriate location
if [ ! -d "/~/.cml_files" ]; then
 mkdir .cml_files
fi
cd $LOCATION
mv ReplaceText.java ~/.cml_files/
