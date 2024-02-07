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
import java.lang.Integer;
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

// typedef: _global.health_report.Impact

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.health_report.Impact">API
 *      specification</a>
 */
@JsonpDeserializable
public class Impact implements JsonpSerializable {
	private final String description;

	private final String id;

	private final List<ImpactArea> impactAreas;

	private final int severity;

	// ---------------------------------------------------------------------------------------------

	private Impact(Builder builder) {

		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.impactAreas = ApiTypeHelper.unmodifiableRequired(builder.impactAreas, this, "impactAreas");
		this.severity = ApiTypeHelper.requireNonNull(builder.severity, this, "severity");

	}

	public static Impact of(Function<Builder, ObjectBuilder<Impact>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code impact_areas}
	 */
	public final List<ImpactArea> impactAreas() {
		return this.impactAreas;
	}

	/**
	 * Required - API name: {@code severity}
	 */
	public final int severity() {
		return this.severity;
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

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("id");
		generator.write(this.id);

		if (ApiTypeHelper.isDefined(this.impactAreas)) {
			generator.writeKey("impact_areas");
			generator.writeStartArray();
			for (ImpactArea item0 : this.impactAreas) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		generator.writeKey("severity");
		generator.write(this.severity);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Impact}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Impact> {
		private String description;

		private String id;

		private List<ImpactArea> impactAreas;

		private Integer severity;

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code impact_areas}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>impactAreas</code>.
		 */
		public final Builder impactAreas(List<ImpactArea> list) {
			this.impactAreas = _listAddAll(this.impactAreas, list);
			return this;
		}

		/**
		 * Required - API name: {@code impact_areas}
		 * <p>
		 * Adds one or more values to <code>impactAreas</code>.
		 */
		public final Builder impactAreas(ImpactArea value, ImpactArea... values) {
			this.impactAreas = _listAdd(this.impactAreas, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code severity}
		 */
		public final Builder severity(int value) {
			this.severity = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Impact}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Impact build() {
			_checkSingleUse();

			return new Impact(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Impact}
	 */
	public static final JsonpDeserializer<Impact> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Impact::setupImpactDeserializer);

	protected static void setupImpactDeserializer(ObjectDeserializer<Impact.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::impactAreas, JsonpDeserializer.arrayDeserializer(ImpactArea._DESERIALIZER), "impact_areas");
		op.add(Builder::severity, JsonpDeserializer.integerDeserializer(), "severity");

	}

}
