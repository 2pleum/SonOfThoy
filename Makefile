save:
	bash scripts/save.sh


# run if and only if java open-sdk21 set as main java
run:
	/usr/bin/java -javaagent:libs/idea_rt.jar=49830:libs/bin \
	-Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 \
	-classpath out/production/SonOfThoy Main

# for optional path installation of java
#run_win_asus:
#    bash scripts/run_win_asus.sh