/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.indices.IndexState;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: cluster.put_component_template.Request

/**
 * Create or update a component template. Component templates are building
 * blocks for constructing index templates that specify index mappings,
 * settings, and aliases.
 * <p>
 * An index template can be composed of multiple component templates. To use a
 * component template, specify it in an index template’s
 * <code>composed_of</code> list. Component templates are only applied to new
 * data streams and indices as part of a matching index template.
 * <p>
 * Settings and mappings specified directly in the index template or the create
 * index request override any settings or mappings specified in a component
 * template.
 * <p>
 * Component templates are only used during index creation. For data streams,
 * this includes data stream creation and the creation of a stream’s backing
 * indices. Changes to component templates do not affect existing indices,
 * including a stream’s backing indices.
 * <p>
 * You can use C-style <code>/* *\/</code> block comments in component
 * templates. You can include comments anywhere in the request body except
 * before the opening curly bracket.
 * <p>
 * <strong>Applying component templates</strong>
 * <p>
 * You cannot directly apply a component template to a data stream or index. To
 * be applied, a component template must be included in an index template's
 * <code>composed_of</code> list.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#cluster.put_component_template.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutComponentTemplateRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, JsonData> meta;

	@Nullable
	private final String cause;

	@Nullable
	private final Boolean create;

	@Nullable
	private final Boolean deprecated;

	@Nullable
	private final Time masterTimeout;

	private final String name;

	private final IndexState template;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	private PutComponentTemplateRequest(Builder builder) {

		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.cause = builder.cause;
		this.create = builder.create;
		this.deprecated = builder.deprecated;
		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.template = ApiTypeHelper.requireNonNull(builder.template, this, "template");
		this.version = builder.version;

	}

	public static PutComponentTemplateRequest of(Function<Builder, ObjectBuilder<PutComponentTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Optional user metadata about the component template. It may have any
	 * contents. This map is not automatically generated by Elasticsearch. This
	 * information is stored in the cluster state, so keeping it short is
	 * preferable. To unset <code>_meta</code>, replace the template without
	 * specifying this information.
	 * <p>
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * User defined reason for create the component template.
	 * <p>
	 * API name: {@code cause}
	 */
	@Nullable
	public final String cause() {
		return this.cause;
	}

	/**
	 * If <code>true</code>, this request cannot replace or update existing
	 * component templates.
	 * <p>
	 * API name: {@code create}
	 */
	@Nullable
	public final Boolean create() {
		return this.create;
	}

	/**
	 * Marks this index template as deprecated. When creating or updating a
	 * non-deprecated index template that uses deprecated components, Elasticsearch
	 * will emit a deprecation warning.
	 * <p>
	 * API name: {@code deprecated}
	 */
	@Nullable
	public final Boolean deprecated() {
		return this.deprecated;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - Name of the component template to create. Elasticsearch includes
	 * the following built-in component templates: <code>logs-mappings</code>;
	 * <code>logs-settings</code>; <code>metrics-mappings</code>;
	 * <code>metrics-settings</code>;<code>synthetics-mapping</code>;
	 * <code>synthetics-settings</code>. Elastic Agent uses these templates to
	 * configure backing indices for its data streams. If you use Elastic Agent and
	 * want to overwrite one of these templates, set the <code>version</code> for
	 * your replacement template higher than the current version. If you don’t use
	 * Elastic Agent and want to disable all built-in component and index templates,
	 * set <code>stack.templates.enabled</code> to <code>false</code> using the
	 * cluster update settings API.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The template to be applied which includes mappings, settings, or
	 * aliases configuration.
	 * <p>
	 * API name: {@code template}
	 */
	public final IndexState template() {
		return this.template;
	}

	/**
	 * Version number used to manage component templates externally. This number
	 * isn't automatically generated or incremented by Elasticsearch. To unset a
	 * version, replace the template without specifying a version.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.deprecated != null) {
			generator.writeKey("deprecated");
			generator.write(this.deprecated);

		}
		generator.writeKey("template");
		this.template.serialize(generator, mapper);

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutComponentTemplateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutComponentTemplateRequest> {
		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private String cause;

		@Nullable
		private Boolean create;

		@Nullable
		private Boolean deprecated;

		@Nullable
		private Time masterTimeout;

		private String name;

		private IndexState template;

		@Nullable
		private Long version;

		/**
		 * Optional user metadata about the component template. It may have any
		 * contents. This map is not automatically generated by Elasticsearch. This
		 * information is stored in the cluster state, so keeping it short is
		 * preferable. To unset <code>_meta</code>, replace the template without
		 * specifying this information.
		 * <p>
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * Optional user metadata about the component template. It may have any
		 * contents. This map is not automatically generated by Elasticsearch. This
		 * information is stored in the cluster state, so keeping it short is
		 * preferable. To unset <code>_meta</code>, replace the template without
		 * specifying this information.
		 * <p>
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * User defined reason for create the component template.
		 * <p>
		 * API name: {@code cause}
		 */
		public final Builder cause(@Nullable String value) {
			this.cause = value;
			return this;
		}

		/**
		 * If <code>true</code>, this request cannot replace or update existing
		 * component templates.
		 * <p>
		 * API name: {@code create}
		 */
		public final Builder create(@Nullable Boolean value) {
			this.create = value;
			return this;
		}

		/**
		 * Marks this index template as deprecated. When creating or updating a
		 * non-deprecated index template that uses deprecated components, Elasticsearch
		 * will emit a deprecation warning.
		 * <p>
		 * API name: {@code deprecated}
		 */
		public final Builder deprecated(@Nullable Boolean value) {
			this.deprecated = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Name of the component template to create. Elasticsearch includes
		 * the following built-in component templates: <code>logs-mappings</code>;
		 * <code>logs-settings</code>; <code>metrics-mappings</code>;
		 * <code>metrics-settings</code>;<code>synthetics-mapping</code>;
		 * <code>synthetics-settings</code>. Elastic Agent uses these templates to
		 * configure backing indices for its data streams. If you use Elastic Agent and
		 * want to overwrite one of these templates, set the <code>version</code> for
		 * your replacement template higher than the current version. If you don’t use
		 * Elastic Agent and want to disable all built-in component and index templates,
		 * set <code>stack.templates.enabled</code> to <code>false</code> using the
		 * cluster update settings API.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The template to be applied which includes mappings, settings, or
		 * aliases configuration.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(IndexState value) {
			this.template = value;
			return this;
		}

		/**
		 * Required - The template to be applied which includes mappings, settings, or
		 * aliases configuration.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(Function<IndexState.Builder, ObjectBuilder<IndexState>> fn) {
			return this.template(fn.apply(new IndexState.Builder()).build());
		}

		/**
		 * Version number used to manage component templates externally. This number
		 * isn't automatically generated or incremented by Elasticsearch. To unset a
		 * version, replace the template without specifying a version.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutComponentTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutComponentTemplateRequest build() {
			_checkSingleUse();

			return new PutComponentTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutComponentTemplateRequest}
	 */
	public static final JsonpDeserializer<PutComponentTemplateRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutComponentTemplateRequest::setupPutComponentTemplateRequestDeserializer);

	protected static void setupPutComponentTemplateRequestDeserializer(
			ObjectDeserializer<PutComponentTemplateRequest.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::deprecated, JsonpDeserializer.booleanDeserializer(), "deprecated");
		op.add(Builder::template, IndexState._DESERIALIZER, "template");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.put_component_template}".
	 */
	public static final Endpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cluster.put_component_template",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_component_template");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				if (request.cause != null) {
					params.put("cause", request.cause);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutComponentTemplateResponse._DESERIALIZER);
}
