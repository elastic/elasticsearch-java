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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
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

// typedef: ilm.migrate_to_data_tiers.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ilm.migrate_to_data_tiers.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class MigrateToDataTiersResponse implements JsonpSerializable {
	private final boolean dryRun;

	private final String removedLegacyTemplate;

	private final List<String> migratedIlmPolicies;

	private final List<String> migratedIndices;

	private final List<String> migratedLegacyTemplates;

	private final List<String> migratedComposableTemplates;

	private final List<String> migratedComponentTemplates;

	// ---------------------------------------------------------------------------------------------

	private MigrateToDataTiersResponse(Builder builder) {

		this.dryRun = ApiTypeHelper.requireNonNull(builder.dryRun, this, "dryRun");
		this.removedLegacyTemplate = ApiTypeHelper.requireNonNull(builder.removedLegacyTemplate, this,
				"removedLegacyTemplate");
		this.migratedIlmPolicies = ApiTypeHelper.unmodifiableRequired(builder.migratedIlmPolicies, this,
				"migratedIlmPolicies");
		this.migratedIndices = ApiTypeHelper.unmodifiableRequired(builder.migratedIndices, this, "migratedIndices");
		this.migratedLegacyTemplates = ApiTypeHelper.unmodifiableRequired(builder.migratedLegacyTemplates, this,
				"migratedLegacyTemplates");
		this.migratedComposableTemplates = ApiTypeHelper.unmodifiableRequired(builder.migratedComposableTemplates, this,
				"migratedComposableTemplates");
		this.migratedComponentTemplates = ApiTypeHelper.unmodifiableRequired(builder.migratedComponentTemplates, this,
				"migratedComponentTemplates");

	}

	public static MigrateToDataTiersResponse of(Function<Builder, ObjectBuilder<MigrateToDataTiersResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code dry_run}
	 */
	public final boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * Required - API name: {@code removed_legacy_template}
	 */
	public final String removedLegacyTemplate() {
		return this.removedLegacyTemplate;
	}

	/**
	 * Required - API name: {@code migrated_ilm_policies}
	 */
	public final List<String> migratedIlmPolicies() {
		return this.migratedIlmPolicies;
	}

	/**
	 * Required - API name: {@code migrated_indices}
	 */
	public final List<String> migratedIndices() {
		return this.migratedIndices;
	}

	/**
	 * Required - API name: {@code migrated_legacy_templates}
	 */
	public final List<String> migratedLegacyTemplates() {
		return this.migratedLegacyTemplates;
	}

	/**
	 * Required - API name: {@code migrated_composable_templates}
	 */
	public final List<String> migratedComposableTemplates() {
		return this.migratedComposableTemplates;
	}

	/**
	 * Required - API name: {@code migrated_component_templates}
	 */
	public final List<String> migratedComponentTemplates() {
		return this.migratedComponentTemplates;
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

		generator.writeKey("dry_run");
		generator.write(this.dryRun);

		generator.writeKey("removed_legacy_template");
		generator.write(this.removedLegacyTemplate);

		if (ApiTypeHelper.isDefined(this.migratedIlmPolicies)) {
			generator.writeKey("migrated_ilm_policies");
			generator.writeStartArray();
			for (String item0 : this.migratedIlmPolicies) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.migratedIndices)) {
			generator.writeKey("migrated_indices");
			generator.writeStartArray();
			for (String item0 : this.migratedIndices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.migratedLegacyTemplates)) {
			generator.writeKey("migrated_legacy_templates");
			generator.writeStartArray();
			for (String item0 : this.migratedLegacyTemplates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.migratedComposableTemplates)) {
			generator.writeKey("migrated_composable_templates");
			generator.writeStartArray();
			for (String item0 : this.migratedComposableTemplates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.migratedComponentTemplates)) {
			generator.writeKey("migrated_component_templates");
			generator.writeStartArray();
			for (String item0 : this.migratedComponentTemplates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MigrateToDataTiersResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MigrateToDataTiersResponse> {
		private Boolean dryRun;

		private String removedLegacyTemplate;

		private List<String> migratedIlmPolicies;

		private List<String> migratedIndices;

		private List<String> migratedLegacyTemplates;

		private List<String> migratedComposableTemplates;

		private List<String> migratedComponentTemplates;

		/**
		 * Required - API name: {@code dry_run}
		 */
		public final Builder dryRun(boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * Required - API name: {@code removed_legacy_template}
		 */
		public final Builder removedLegacyTemplate(String value) {
			this.removedLegacyTemplate = value;
			return this;
		}

		/**
		 * Required - API name: {@code migrated_ilm_policies}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>migratedIlmPolicies</code>.
		 */
		public final Builder migratedIlmPolicies(List<String> list) {
			this.migratedIlmPolicies = _listAddAll(this.migratedIlmPolicies, list);
			return this;
		}

		/**
		 * Required - API name: {@code migrated_ilm_policies}
		 * <p>
		 * Adds one or more values to <code>migratedIlmPolicies</code>.
		 */
		public final Builder migratedIlmPolicies(String value, String... values) {
			this.migratedIlmPolicies = _listAdd(this.migratedIlmPolicies, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code migrated_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>migratedIndices</code>.
		 */
		public final Builder migratedIndices(List<String> list) {
			this.migratedIndices = _listAddAll(this.migratedIndices, list);
			return this;
		}

		/**
		 * Required - API name: {@code migrated_indices}
		 * <p>
		 * Adds one or more values to <code>migratedIndices</code>.
		 */
		public final Builder migratedIndices(String value, String... values) {
			this.migratedIndices = _listAdd(this.migratedIndices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code migrated_legacy_templates}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>migratedLegacyTemplates</code>.
		 */
		public final Builder migratedLegacyTemplates(List<String> list) {
			this.migratedLegacyTemplates = _listAddAll(this.migratedLegacyTemplates, list);
			return this;
		}

		/**
		 * Required - API name: {@code migrated_legacy_templates}
		 * <p>
		 * Adds one or more values to <code>migratedLegacyTemplates</code>.
		 */
		public final Builder migratedLegacyTemplates(String value, String... values) {
			this.migratedLegacyTemplates = _listAdd(this.migratedLegacyTemplates, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code migrated_composable_templates}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>migratedComposableTemplates</code>.
		 */
		public final Builder migratedComposableTemplates(List<String> list) {
			this.migratedComposableTemplates = _listAddAll(this.migratedComposableTemplates, list);
			return this;
		}

		/**
		 * Required - API name: {@code migrated_composable_templates}
		 * <p>
		 * Adds one or more values to <code>migratedComposableTemplates</code>.
		 */
		public final Builder migratedComposableTemplates(String value, String... values) {
			this.migratedComposableTemplates = _listAdd(this.migratedComposableTemplates, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code migrated_component_templates}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>migratedComponentTemplates</code>.
		 */
		public final Builder migratedComponentTemplates(List<String> list) {
			this.migratedComponentTemplates = _listAddAll(this.migratedComponentTemplates, list);
			return this;
		}

		/**
		 * Required - API name: {@code migrated_component_templates}
		 * <p>
		 * Adds one or more values to <code>migratedComponentTemplates</code>.
		 */
		public final Builder migratedComponentTemplates(String value, String... values) {
			this.migratedComponentTemplates = _listAdd(this.migratedComponentTemplates, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MigrateToDataTiersResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MigrateToDataTiersResponse build() {
			_checkSingleUse();

			return new MigrateToDataTiersResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MigrateToDataTiersResponse}
	 */
	public static final JsonpDeserializer<MigrateToDataTiersResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MigrateToDataTiersResponse::setupMigrateToDataTiersResponseDeserializer);

	protected static void setupMigrateToDataTiersResponseDeserializer(
			ObjectDeserializer<MigrateToDataTiersResponse.Builder> op) {

		op.add(Builder::dryRun, JsonpDeserializer.booleanDeserializer(), "dry_run");
		op.add(Builder::removedLegacyTemplate, JsonpDeserializer.stringDeserializer(), "removed_legacy_template");
		op.add(Builder::migratedIlmPolicies,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "migrated_ilm_policies");
		op.add(Builder::migratedIndices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"migrated_indices");
		op.add(Builder::migratedLegacyTemplates,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"migrated_legacy_templates");
		op.add(Builder::migratedComposableTemplates,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"migrated_composable_templates");
		op.add(Builder::migratedComponentTemplates,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"migrated_component_templates");

	}

}
