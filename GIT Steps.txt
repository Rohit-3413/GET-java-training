***** GIT Steps**********

Create a new project/remote repository in GitLab/GitHub

1. nameoftheproject
2. Change private to public
3. remove the checkbox of Readme(optional)
 
 //GIT Configuration in ur local system for first time
gitbash - repos folder
//do this for first time
 git config --global user.email "abc@rps.com"
 git config --global user.name "abc"

*** Create Local repository*******
1. git init (if already .git folder is there delete it(view -> hidden items and check box))
2. git remote add origin http://10.10.16.125:8929/username/projectname.git //give different origin
3. git add .    -- -- Start from this step to add more files to existing project
4. git status -> red/green 
4. git commit -m "Initial commit"
5. git push  origin main


 push - push to github
             -u   - upstream
             origin- remote repository
             master - local repo

Enter username and password (one time only)
verify in Gitlab/GitHub for Project pushed status
