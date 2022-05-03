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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Influence

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.Influence">API
 *      specification</a>
 */
@JsonpDeserializable
public class Influence implements JsonpSerializable {
	private final String influencerFieldName;

	private final List<String> influencerFieldValues;

	// ---------------------------------------------------------------------------------------------

	private Influence(Builder builder) {

		this.influencerFieldName = ApiTypeHelper.requireNonNull(builder.influencerFieldName, this,
				"influencerFieldName");
		this.influencerFieldValues = ApiTypeHelper.unmodifiableRequired(builder.influencerFieldValues, this,
				"influencerFieldValues");

	}

	public static Influence of(Function<Builder, ObjectBuilder<Influence>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code influencer_field_name}
	 */
	public final String influencerFieldName() {
		return this.influencerFieldName;
	}

	/**
	 * Required - API name: {@code influencer_field_values}
	 */
	public final List<String> influencerFieldValues() {
		return this.influencerFieldValues;
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

		generator.writeKey("influencer_field_name");
		generator.write(this.influencerFieldName);

		if (ApiTypeHelper.isDefined(this.influencerFieldValues)) {
			generator.writeKey("influencer_field_values");
			generator.writeStartArray();
			for (String item0 : this.influencerFieldValues) {
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
	 * Builder for {@link Influence}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Influence> {
		private String influencerFieldName;

		private List<String> influencerFieldValues;

		/**
		 * Required - API name: {@code influencer_field_name}
		 */
		public final Builder influencerFieldName(String value) {
			this.influencerFieldName = value;
			return this;
		}

		/**
		 * Required - API name: {@code influencer_field_values}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>influencerFieldValues</code>.
		 */
		public final Builder influencerFieldValues(List<String> list) {
			this.influencerFieldValues = _listAddAll(this.influencerFieldValues, list);
			return this;
		}

		/**
		 * Required - API name: {@code influencer_field_values}
		 * <p>
		 * Adds one or more values to <code>influencerFieldValues</code>.
		 */
		public final Builder influencerFieldValues(String value, String... values) {
			this.influencerFieldValues = _listAdd(this.influencerFieldValues, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Influence}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Influence build() {
			_checkSingleUse();

			return new Influence(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Influence}
	 */
	public static final JsonpDeserializer<Influence> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Influence::setupInfluenceDeserializer);

	protected static void setupInfluenceDeserializer(ObjectDeserializer<Influence.Builder> op) {

		op.add(Builder::influencerFieldName, JsonpDeserializer.stringDeserializer(), "influencer_field_name");
		op.add(Builder::influencerFieldValues,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "influencer_field_values");

	}

}
