This folder contains all the files that were used to create the capabilities of the command "run_live" -- a command that allows you to write one command and get a live debug server up for psiturk (and have the link copied to your clipboard automatically), a process that would normally take numerous steps.

In order to add the alias "run_live" to your .bash_profile, download the Run_Live_Setup.zip file and run the provided shell script. If you need further directions, reference the README in the folder that will appear after unzipping the downloaded file.

The file "run_live.sh" was a preliminary file created before the final product was made. The folder Run_Live_Setup is the real product and all the necessary files associated with it (and Run_Live_Setup.zip is just a compressed version of this folder that can be downloaded). ReplaceText.java is the java file that does the necessary computations needed to get the correct link output from the command (and the .class file is just the compiled version of this).

Note: you will need to have a a current version of JDK downloaded in order for this to work. If you do not, you will likely be alerted and be able to easily and quickly download one.

Also note: If another server is running on the same PID, you will need to shut that server down before running this one OR edit the command in your .bash_profile to run on another port than the default one.
