PROJECT TITLE: Disk Defragmentation
AUTHOR: Brian Krick
USER INSTRUCTIONS:
Very cut and dry, you create a Disk object, then create FilePart objects to represent pieces
of a fragmented file, the Disk object has a method called "addFilePart" that takes the specified FilePart
and the location you wish to put it in the array held by the Disk. Once the Disk is populated, running the 
Defragment method will sort the FileParts to the front in alphebetical and ascending numeric order, leaving the
empty spaces at the end of the file. For time's sake, there are two Constructors provided that will populate the
Disk's array upon creation. The input of the Contructor's parameters has no effect on the outcome of the final results.