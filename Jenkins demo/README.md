# jenkinsdemo

CONSOLE OUTPUT

Started by user prajwal bhadrashetty
Obtained Jenkinsfile from git https://github.com/prajwalbhadrashetty/jenkinsdemo
[Pipeline] Start of Pipeline
[Pipeline] node
Running on Jenkins in C:\ProgramData\Jenkins\.jenkins\workspace\jenkinsdemo
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Declarative: Checkout SCM)
[Pipeline] checkout
Selected Git installation does not exist. Using Default
The recommended git tool is: NONE
No credentials specified
 > git.exe rev-parse --resolve-git-dir C:\ProgramData\Jenkins\.jenkins\workspace\jenkinsdemo\.git # timeout=10
Fetching changes from the remote Git repository
 > git.exe config remote.origin.url https://github.com/prajwalbhadrashetty/jenkinsdemo # timeout=10
Fetching upstream changes from https://github.com/prajwalbhadrashetty/jenkinsdemo
 > git.exe --version # timeout=10
 > git --version # 'git version 2.36.1.windows.1'
 > git.exe fetch --tags --force --progress -- https://github.com/prajwalbhadrashetty/jenkinsdemo +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git.exe rev-parse "refs/remotes/origin/main^{commit}" # timeout=10
Checking out Revision 8291ecf11fc377cb245e7854ec506920f0082e16 (refs/remotes/origin/main)
 > git.exe config core.sparsecheckout # timeout=10
 > git.exe checkout -f 8291ecf11fc377cb245e7854ec506920f0082e16 # timeout=10
Commit message: "demo"
 > git.exe rev-list --no-walk 8291ecf11fc377cb245e7854ec506920f0082e16 # timeout=10
[Pipeline] }
[Pipeline] // stage
[Pipeline] withEnv
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Compile)
[Pipeline] echo
compiling the code
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Test)
[Pipeline] echo
Testing the code
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Build)
[Pipeline] echo
Building the code
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
Finished: SUCCESS