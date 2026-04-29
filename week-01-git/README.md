# Week 1 - Git Fundamentals

✅ Git Module — OFFICIALLY DONE!
 
 Git Module — OFFICIALLY DONE!
✅ git init              → initialize repo                                
✅ git config            → setup identity
✅ git status / -s       → check state
✅ git add               → stage changes
✅ git commit            → save snapshot
✅ git commit -a         → skip staging
✅ git diff              → see changes
✅ git log / --oneline   → view history
✅ git rm                → remove files
✅ git mv                → move/rename files
✅ git branch            → manage branches
✅ git checkout -b       → create + switch branch
✅ git merge             → combine branches
✅ git reset             → undo commits
✅ git clone             → copy remote repo


//Additional
# 1. Download changes from GitHub without merging
git fetch

# 2. Download AND merge changes (fetch + merge in one)
git pull

# 3. Send your commits to GitHub
git push

# 4. Push a NEW branch to GitHub for the first time
git push -u origin feature-login

# 5. See all remote connections
git remote -v

git checkout -b feature-login    # create branch
# write code...
git add .                        # stage
git commit -m "added login"      # commit
git push -u origin feature-login # push to GitHub
# create Pull Request on GitHub
# get reviewed and approved
# merge to master ✅