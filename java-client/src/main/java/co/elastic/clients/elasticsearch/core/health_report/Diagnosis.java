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

package co.elastic.clients.elasticsearch.core.health_report;

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
import java.lang.String;
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

// typedef: _global.health_report.Diagnosis

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.Diagnosis">API
 *      specification</a>
 */
@JsonpDeserializable
public class Diagnosis implements JsonpSerializable {
	private final String id;

	private final String action;

	private final DiagnosisAffectedResources affectedResources;

	private final String cause;

	private final String helpUrl;

	// ---------------------------------------------------------------------------------------------

	private Diagnosis(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.action = ApiTypeHelper.requireNonNull(builder.action, this, "action");
		this.affectedResources = ApiTypeHelper.requireNonNull(builder.affectedResources, this, "affectedResources");
		this.cause = ApiTypeHelper.requireNonNull(builder.cause, this, "cause");
		this.helpUrl = ApiTypeHelper.requireNonNull(builder.helpUrl, this, "helpUrl");

	}

	public static Diagnosis of(Function<Builder, ObjectBuilder<Diagnosis>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code action}
	 */
	public final String action() {
		return this.action;
	}

	/**
	 * Required - API name: {@code affected_resources}
	 */
	public final DiagnosisAffectedResources affectedResources() {
		return this.affectedResources;
	}

	/**
	 * Required - API name: {@code cause}
	 */
	public final String cause() {
		return this.cause;
	}

	/**
	 * Required - API name: {@code help_url}
	 */
	public final String helpUrl() {
		return this.helpUrl;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("action");
		generator.write(this.action);

		generator.writeKey("affected_resources");
		this.affectedResources.serialize(generator, mapper);

		generator.writeKey("cause");
		generator.write(this.cause);

		generator.writeKey("help_url");
		generator.write(this.helpUrl);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Diagnosis}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Diagnosis> {
		private String id;

		private String action;

		private DiagnosisAffectedResources affectedResources;

		private String cause;

		private String helpUrl;

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code action}
		 */
		public final Builder action(String value) {
			this.action = value;
			return this;
		}

		/**
		 * Required - API name: {@code affected_resources}
		 */
		public final Builder affectedResources(DiagnosisAffectedResources value) {
			this.affectedResources = value;
			return this;
		}

		/**
		 * Required - API name: {@code affected_resources}
		 */
		public final Builder affectedResources(
				Function<DiagnosisAffectedResources.Builder, ObjectBuilder<DiagnosisAffectedResources>> fn) {
			return this.affectedResources(fn.apply(new DiagnosisAffectedResources.Builder()).build());
		}

		/**
		 * Required - API name: {@code cause}
		 */
		public final Builder cause(String value) {
			this.cause = value;
			return this;
		}

		/**
		 * Required - API name: {@code help_url}
		 */
		public final Builder helpUrl(String value) {
			this.helpUrl = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Diagnosis}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Diagnosis build() {
			_checkSingleUse();

			return new Diagnosis(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Diagnosis}
	 */
	public static final JsonpDeserializer<Diagnosis> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Diagnosis::setupDiagnosisDeserializer);

	protected static void setupDiagnosisDeserializer(ObjectDeserializer<Diagnosis.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(Builder::affectedResources, DiagnosisAffectedResources._DESERIALIZER, "affected_resources");
		op.add(Builder::cause, JsonpDeserializer.stringDeserializer(), "cause");
		op.add(Builder::helpUrl, JsonpDeserializer.stringDeserializer(), "help_url");

	}

}
