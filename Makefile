save:
	bash scripts/save.sh

run:
	/usr/bin/java -javaagent:libs/idea_rt.jar=49830:libs/bin \
	-Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 \
	-classpath out/production/SonOfThoy Main
