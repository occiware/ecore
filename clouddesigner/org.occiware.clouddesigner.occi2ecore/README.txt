Dans l'ordre d'utilisation :
- FixAllDynamics copie les fichiers issus du projet metamodels/ et au passage change les href vers le fichier OCCI.ecore local vers le métamodèle OCCI déployé
- ConvertInfrastructure convertit l'extension Infrastructure.xmi en métamodèle Ecore étendant le métamodèle OCCI
- ConvertDocker convertit l'extension Docker.xmi en métamodèle Ecore étendant le métamodèle OCCI et Infrastructure
- ConvertDockerConfiguration convertit les configurations Docker en configurations Docker exploitant le métamodèle Docker au lieu des kinds

! Attention toutes les étapes ne sont pas finalisées, il faut encore retoucher le produit de certaines transformations avant l'étape suivante.

Les fichiers CHANGES indiquent les changements faits ou à faire sur les fichiers avant utilisation.

