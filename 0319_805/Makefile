
JC := javac
JCFLAGS := 

SRCS := $(wildcard sim/**/*.java)
CLS := $(SRCS:%.java=%.class)

CLASSPATH := ../oracle_javacard_sdks/jc221_kit/lib/api.jar 
JCFLAGS := -g -sourcepath . -cp $(CLASSPATH) -target 1.1 -source 1.3

sim.jar: $(CLS)
	jar cf sim.jar $(CLS)

%.class: %.java 
	$(JC) $(JCFLAGS) $<

clean:
	rm -f sim.jar
	find sim -name '*.class' -delete