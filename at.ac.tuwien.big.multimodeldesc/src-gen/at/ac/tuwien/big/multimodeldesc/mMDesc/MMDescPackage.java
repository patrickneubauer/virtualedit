/**
 * generated by Xtext 2.11.0
 */
package at.ac.tuwien.big.multimodeldesc.mMDesc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.multimodeldesc.mMDesc.MMDescFactory
 * @model kind="package"
 * @generated
 */
public interface MMDescPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mMDesc";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.at/tuwien/big/multimodeldesc/MMDesc";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mMDesc";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MMDescPackage eINSTANCE = at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescPackageImpl.init();

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescImpl <em>MM Desc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescImpl
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescPackageImpl#getMMDesc()
   * @generated
   */
  int MM_DESC = 0;

  /**
   * The feature id for the '<em><b>Point Desc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MM_DESC__POINT_DESC = 0;

  /**
   * The feature id for the '<em><b>Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MM_DESC__MODELS = 1;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MM_DESC__VIEW = 2;

  /**
   * The number of structural features of the '<em>MM Desc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MM_DESC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.impl.PointDescImpl <em>Point Desc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.PointDescImpl
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescPackageImpl#getPointDesc()
   * @generated
   */
  int POINT_DESC = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_DESC__TYPE = 0;

  /**
   * The number of structural features of the '<em>Point Desc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_DESC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.impl.ModelRefImpl <em>Model Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.ModelRefImpl
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescPackageImpl#getModelRef()
   * @generated
   */
  int MODEL_REF = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REF__ID = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REF__URI = 1;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REF__DATA = 2;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REF__NEXT = 3;

  /**
   * The feature id for the '<em><b>Continue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REF__CONTINUE = 4;

  /**
   * The number of structural features of the '<em>Model Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REF_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.impl.ModelViewImpl <em>Model View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.ModelViewImpl
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescPackageImpl#getModelView()
   * @generated
   */
  int MODEL_VIEW = 3;

  /**
   * The feature id for the '<em><b>Viewed</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_VIEW__VIEWED = 0;

  /**
   * The number of structural features of the '<em>Model View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_VIEW_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.MMDesc <em>MM Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MM Desc</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.MMDesc
   * @generated
   */
  EClass getMMDesc();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.MMDesc#getPointDesc <em>Point Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Point Desc</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.MMDesc#getPointDesc()
   * @see #getMMDesc()
   * @generated
   */
  EReference getMMDesc_PointDesc();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.MMDesc#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Models</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.MMDesc#getModels()
   * @see #getMMDesc()
   * @generated
   */
  EReference getMMDesc_Models();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.MMDesc#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.MMDesc#getView()
   * @see #getMMDesc()
   * @generated
   */
  EReference getMMDesc_View();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.PointDesc <em>Point Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point Desc</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.PointDesc
   * @generated
   */
  EClass getPointDesc();

  /**
   * Returns the meta object for the attribute list '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.PointDesc#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.PointDesc#getType()
   * @see #getPointDesc()
   * @generated
   */
  EAttribute getPointDesc_Type();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef <em>Model Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Ref</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef
   * @generated
   */
  EClass getModelRef();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef#getId()
   * @see #getModelRef()
   * @generated
   */
  EAttribute getModelRef_Id();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef#getUri()
   * @see #getModelRef()
   * @generated
   */
  EAttribute getModelRef_Uri();

  /**
   * Returns the meta object for the attribute list '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Data</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef#getData()
   * @see #getModelRef()
   * @generated
   */
  EAttribute getModelRef_Data();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Next</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef#getNext()
   * @see #getModelRef()
   * @generated
   */
  EReference getModelRef_Next();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef#isContinue <em>Continue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Continue</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.ModelRef#isContinue()
   * @see #getModelRef()
   * @generated
   */
  EAttribute getModelRef_Continue();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.ModelView <em>Model View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model View</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.ModelView
   * @generated
   */
  EClass getModelView();

  /**
   * Returns the meta object for the reference list '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.ModelView#getViewed <em>Viewed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Viewed</em>'.
   * @see at.ac.tuwien.big.multimodeldesc.mMDesc.ModelView#getViewed()
   * @see #getModelView()
   * @generated
   */
  EReference getModelView_Viewed();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MMDescFactory getMMDescFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescImpl <em>MM Desc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescImpl
     * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescPackageImpl#getMMDesc()
     * @generated
     */
    EClass MM_DESC = eINSTANCE.getMMDesc();

    /**
     * The meta object literal for the '<em><b>Point Desc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MM_DESC__POINT_DESC = eINSTANCE.getMMDesc_PointDesc();

    /**
     * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MM_DESC__MODELS = eINSTANCE.getMMDesc_Models();

    /**
     * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MM_DESC__VIEW = eINSTANCE.getMMDesc_View();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.impl.PointDescImpl <em>Point Desc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.PointDescImpl
     * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescPackageImpl#getPointDesc()
     * @generated
     */
    EClass POINT_DESC = eINSTANCE.getPointDesc();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT_DESC__TYPE = eINSTANCE.getPointDesc_Type();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.impl.ModelRefImpl <em>Model Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.ModelRefImpl
     * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescPackageImpl#getModelRef()
     * @generated
     */
    EClass MODEL_REF = eINSTANCE.getModelRef();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_REF__ID = eINSTANCE.getModelRef_Id();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_REF__URI = eINSTANCE.getModelRef_Uri();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_REF__DATA = eINSTANCE.getModelRef_Data();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_REF__NEXT = eINSTANCE.getModelRef_Next();

    /**
     * The meta object literal for the '<em><b>Continue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_REF__CONTINUE = eINSTANCE.getModelRef_Continue();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.multimodeldesc.mMDesc.impl.ModelViewImpl <em>Model View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.ModelViewImpl
     * @see at.ac.tuwien.big.multimodeldesc.mMDesc.impl.MMDescPackageImpl#getModelView()
     * @generated
     */
    EClass MODEL_VIEW = eINSTANCE.getModelView();

    /**
     * The meta object literal for the '<em><b>Viewed</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_VIEW__VIEWED = eINSTANCE.getModelView_Viewed();

  }

} //MMDescPackage
