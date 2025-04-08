
hybris Changes
=============================

This is a modified version of Solr.

The following directories were removed:
- docs
- example

The following files/directories were added:
- HYBRIS_README.txt
- contrib/hybris
- server/solr/security.json.example
- server/solr/solr.p12
- server/solr/solr_client.p12

The following files/directories were modified/replaced:
- bin/solr.cmd:
	- workaround for https://issues.apache.org/jira/browse/SOLR-7283 (lines 19-20)
- bin/solr.in.cmd:
	- authentication and ssl configuration example (lines 208-227)
	- remove UseLargePages parameter from GC_TUNE parameters due to problems with running solr within docker container (line 229)
- bin/solr.in.sh:
	- authentication and ssl configuration example (lines 236-255)
	- remove UseLargePages parameter from GC_TUNE parameters due to problems with running solr within docker container (line 257)
- server/solr/solr.xml
- server/solr/configsets
- jackson-databind related files (due to https://issues.apache.org/jira/browse/SOLR-13901)
	- licenses/jackson-databind-2.10.1.jar.sha1 -> licenses/jackson-databind-2.10.3.jar.sha1
	- server/solr-webapp/webapp/WEB-INF/lib/jackson-databind-2.10.1.jar -> server/solr-webapp/webapp/WEB-INF/lib/jackson-databind-2.10.3.jar
	- contrib/clustering/lib/jackson-databind-2.10.1.jar -> contrib/clustering/lib/jackson-databind-2.10.3.jar
	- contrib/prometheus-exporter/lib/jackson-databind-2.10.1.jar -> contrib/prometheus-exporter/lib/jackson-databind-2.10.3.jar
- jetty libraries (dute to https://www.whitesourcesoftware.com/vulnerability-database/CVE-2019-17638 and https://www.whitesourcesoftware.com/vulnerability-database/CVE-2020-27216)
	- licenses/jetty-alpn-client-9.4.27.v20200227.jar.sha1 -> licenses/jetty-alpn-client-9.4.33.v20201020.jar.sha1
	- dist/solrj-lib/jetty-alpn-client-9.4.27.v20200227.jar -> dist/solrj-lib/jetty-alpn-client-9.4.33.v20201020jar
	- server/solr-webapp/webapp/WEB-INF/lib/jetty-alpn-client-9.4.27.v20200227.jar -> server/solr-webapp/webapp/WEB-INF/lib/jetty-alpn-client-9.4.33.v20201020.jar
	- licenses/jetty-alpn-java-client-9.4.27.v20200227.jar.sha1 -> licenses/jetty-alpn-java-client-9.4.33.v20201020.jar.sha1
	- dist/solrj-lib/jetty-alpn-java-client-9.4.27.v20200227.jar -> dist/solrj-lib/jetty-alpn-java-client-9.4.33.v20201020.jar
	- server/solr-webapp/webapp/WEB-INF/lib/jetty-alpn-java-client-9.4.27.v20200227.jar -> server/solr-webapp/webapp/WEB-INF/lib/jetty-alpn-java-client-9.4.33.v20201020.jar
	- licenses/jetty-alpn-java-server-9.4.27.v20200227.jar.sha1 -> licenses/jetty-alpn-java-server-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-alpn-java-server-9.4.27.v20200227.jar -> server/lib/jetty-alpn-java-server-9.4.33.v20201020.jar
	- licenses/jetty-alpn-server-9.4.27.v20200227.jar.sha1 -> licenses/jetty-alpn-server-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-alpn-server-9.4.27.v20200227.jar -> server/lib/jetty-alpn-server-9.4.33.v20201020.jar
	- licenses/jetty-client-9.4.27.v20200227.jar.sha1 -> licenses/jetty-client-9.4.33.v20201020.jar.sha1
	- dist/solrj-lib/jetty-client-9.4.27.v20200227.jar -> dist/solrj-lib/jetty-client-9.4.33.v20201020.jar
	- server/solr-webapp/webapp/WEB-INF/lib/jetty-client-9.4.27.v20200227.jar -> server/solr-webapp/webapp/WEB-INF/lib/jetty-client-9.4.33.v20201020.jar
	- licenses/jetty-continuation-9.4.27.v20200227.jar.sha1 -> licenses/jetty-continuation-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-continuation-9.4.27.v20200227.jar -> server/lib/jetty-continuation-9.4.33.v20201020.jar
	- licenses/jetty-deploy-9.4.27.v20200227.jar.sha1 -> licenses/jetty-deploy-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-deploy-9.4.27.v20200227.jar -> server/lib/jetty-deploy-9.4.33.v20201020.jar
	- licenses/jetty-http-9.4.27.v20200227.jar.sha1 -> licenses/jetty-http-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-http-9.4.27.v20200227.jar -> server/lib/jetty-http-9.4.33.v20201020.jar
	- dist/solrj-lib/jetty-http-9.4.27.v20200227.jar -> dist/solrj-lib/jetty-http-9.4.33.v20201020.jar
	- server/solr-webapp/webapp/WEB-INF/lib/jetty-http-9.4.27.v20200227.jar -> server/solr-webapp/webapp/WEB-INF/lib/jetty-http-9.4.33.v20201020.jar
	- licenses/jetty-io-9.4.27.v20200227.jar.sha1 -> licenses/jetty-io-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-io-9.4.27.v20200227.jar -> server/lib/jetty-io-9.4.33.v20201020.jar
	- dist/solrj-lib/jetty-io-9.4.27.v20200227.jar -> dist/solrj-lib/jetty-io-9.4.33.v20201020.jar
	- server/solr-webapp/webapp/WEB-INF/lib/jetty-io-9.4.27.v20200227.jar -> server/solr-webapp/webapp/WEB-INF/lib/jetty-io-9.4.33.v20201020.jar
	- licenses/jetty-jmx-9.4.27.v20200227.jar.sha1 -> licenses/jetty-jmx-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-jmx-9.4.27.v20200227.jar -> server/lib/jetty-jmx-9.4.33.v20201020.jar
	- licenses/jetty-rewrite-9.4.27.v20200227.jar.sha1 -> licenses/jetty-rewrite-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-rewrite-9.4.27.v20200227.jar -> server/lib/jetty-rewrite-9.4.33.v20201020.jar
	- licenses/jetty-security-9.4.27.v20200227.jar.sha1 -> licenses/jetty-security-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-security-9.4.27.v20200227.jar -> server/lib/jetty-security-9.4.33.v20201020.jar
	- licenses/jetty-server-9.4.27.v20200227.jar.sha1 -> licenses/jetty-server-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-server-9.4.27.v20200227.jar -> server/lib/jetty-server-9.4.33.v20201020.jar
	- licenses/jetty-servlet-9.4.27.v20200227.jar.sha1 -> licenses/jetty-servlet-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-servlet-9.4.27.v20200227.jar -> server/lib/jetty-servlet-9.4.33.v20201020.jar
	- licenses/jetty-servlets-9.4.27.v20200227.jar.sha1 -> licenses/jetty-servlets-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-servlets-9.4.27.v20200227.jar -> server/lib/jetty-servlets-9.4.33.v20201020.jar
	- licenses/jetty-util-9.4.27.v20200227.jar.sha1 -> licenses/jetty-util-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-util-9.4.27.v20200227.jar -> server/lib/jetty-util-9.4.33.v20201020.jar
	- dist/solrj-lib/jetty-util-9.4.27.v20200227.jar -> dist/solrj-lib/jetty-util-9.4.33.v20201020.jar
	- server/solr-webapp/webapp/WEB-INF/lib/jetty-util-9.4.27.v20200227.jar -> server/solr-webapp/webapp/WEB-INF/lib/jetty-util-9.4.33.v20201020.jar
	- licenses/jetty-webapp-9.4.27.v20200227.jar.sha1 -> licenses/jetty-webapp-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-webapp-9.4.27.v20200227.jar -> server/lib/jetty-webapp-9.4.33.v20201020.jar
	- licenses/jetty-xml-9.4.27.v20200227.jar.sha1 -> licenses/jetty-xml-9.4.33.v20201020.jar.sha1
	- server/lib/jetty-xml-9.4.27.v20200227.jar -> server/lib/jetty-xml-9.4.33.v20201020.jar
