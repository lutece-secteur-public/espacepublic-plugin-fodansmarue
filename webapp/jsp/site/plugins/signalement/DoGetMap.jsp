<jsp:useBean id="signalementMap" scope="session"
	class="fr.paris.lutece.plugins.fodansmarue.web.SignalementMapJspBean" />

<%= signalementMap.getMap( request ) %>