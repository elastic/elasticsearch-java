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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
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

// typedef: ilm.migrate_to_data_tiers.Request

/**
 * Switches the indices, ILM policies, and legacy, composable and component
 * templates from using custom node attributes and attribute-based allocation
 * filters to using data tiers, and optionally deletes one legacy index
 * template.+ Using node roles enables ILM to automatically move the indices
 * between data tiers.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ilm.migrate_to_data_tiers.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class MigrateToDataTiersRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean dryRun;

	@Nullable
	private final String legacyTemplateToDelete;

	@Nullable
	private final String nodeAttribute;

	// ---------------------------------------------------------------------------------------------

	private MigrateToDataTiersRequest(Builder builder) {

		this.dryRun = builder.dryRun;
		this.legacyTemplateToDelete = builder.legacyTemplateToDelete;
		this.nodeAttribute = builder.nodeAttribute;

	}

	public static MigrateToDataTiersRequest of(Function<Builder, ObjectBuilder<MigrateToDataTiersRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If true, simulates the migration from node attributes based allocation
	 * filters to data tiers, but does not perform the migration. This provides a
	 * way to retrieve the indices and ILM policies that need to be migrated.
	 * <p>
	 * API name: {@code dry_run}
	 */
	@Nullable
	public final Boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * API name: {@code legacy_template_to_delete}
	 */
	@Nullable
	public final String legacyTemplateToDelete() {
		return this.legacyTemplateToDelete;
	}

	/**
	 * API name: {@code node_attribute}
	 */
	@Nullable
	public final String nodeAttribute() {
		return this.nodeAttribute;
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

		if (this.legacyTemplateToDelete != null) {
			generator.writeKey("legacy_template_to_delete");
			generator.write(this.legacyTemplateToDelete);

		}
		if (this.nodeAttribute != null) {
			generator.writeKey("node_attribute");
			generator.write(this.nodeAttribute);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MigrateToDataTiersRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MigrateToDataTiersRequest> {
		@Nullable
		private Boolean dryRun;

		@Nullable
		private String legacyTemplateToDelete;

		@Nullable
		private String nodeAttribute;

		/**
		 * If true, simulates the migration from node attributes based allocation
		 * filters to data tiers, but does not perform the migration. This provides a
		 * way to retrieve the indices and ILM policies that need to be migrated.
		 * <p>
		 * API name: {@code dry_run}
		 */
		public final Builder dryRun(@Nullable Boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * API name: {@code legacy_template_to_delete}
		 */
		public final Builder legacyTemplateToDelete(@Nullable String value) {
			this.legacyTemplateToDelete = value;
			return this;
		}

		/**
		 * API name: {@code node_attribute}
		 */
		public final Builder nodeAttribute(@Nullable String value) {
			this.nodeAttribute = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MigrateToDataTiersRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MigrateToDataTiersRequest build() {
			_checkSingleUse();

			return new MigrateToDataTiersRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MigrateToDataTiersRequest}
	 */
	public static final JsonpDeserializer<MigrateToDataTiersRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MigrateToDataTiersRequest::setupMigrateToDataTiersRequestDeserializer);

	protected static void setupMigrateToDataTiersRequestDeserializer(
			ObjectDeserializer<MigrateToDataTiersRequest.Builder> op) {

		op.add(Builder::legacyTemplateToDelete, JsonpDeserializer.stringDeserializer(), "legacy_template_to_delete");
		op.add(Builder::nodeAttribute, JsonpDeserializer.stringDeserializer(), "node_attribute");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ilm.migrate_to_data_tiers}".
	 */
	public static final Endpoint<MigrateToDataTiersRequest, MigrateToDataTiersResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ilm.migrate_to_data_tiers",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_ilm/migrate_to_data_tiers";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.dryRun != null) {
					params.put("dry_run", String.valueOf(request.dryRun));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, MigrateToDataTiersResponse._DESERIALIZER);
}
