
JC := javac
JCFLAGS := 

SRCS := $(wildcard sim/**/*.java)
CLS := $(SRCS:%.java=%.class)

CLASSPATH := ../oracle_javacard_sdks/jc211_kit/bin/api.jar 

sim.jar: $(CLS)
	jar cf sim.jar $(CLS)

%.class: %.java 
	$(JC) -g  -sourcepath . -cp $(CLASSPATH) $(JCFLAGS) $<

clean:
	rm -f sim.jar
	find sim -name '*.class' -delete