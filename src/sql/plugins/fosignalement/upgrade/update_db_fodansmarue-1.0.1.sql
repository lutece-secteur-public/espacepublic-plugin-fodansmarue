-- DMR 133 active site labels plugin --
DELETE FROM core_datastore WHERE entity_key='core.plugins.status.sitelabels.installed';
INSERT INTO core_datastore values ('core.plugins.status.sitelabels.installed', 'true');

-- DMR 314 active mylutece openAM Piwik plugins --  
DELETE FROM core_datastore WHERE entity_key='core.plugins.status.mylutece.installed';
INSERT INTO core_datastore values ('core.plugins.status.mylutece.installed', 'true');
DELETE FROM core_datastore WHERE entity_key='core.plugins.status.mylutece-openam.installed';
INSERT INTO core_datastore values ('core.plugins.status.mylutece-openam.installed', 'true');
DELETE FROM core_datastore WHERE entity_key='core.plugins.status.identitystoreopenamprovider.installed';
INSERT INTO core_datastore values ('core.plugins.status.identitystoreopenamprovider.installed', 'true');
DELETE FROM core_datastore WHERE entity_key='core.plugins.status.piwik.installed';
INSERT INTO core_datastore values ('core.plugins.status.piwik.installed', 'true');