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

package co.elastic.clients.elasticsearch.security.suggest_user_profiles;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.suggest_user_profiles.TotalUserProfiles

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.suggest_user_profiles.TotalUserProfiles">API
 *      specification</a>
 */
@JsonpDeserializable
public class TotalUserProfiles implements JsonpSerializable {
	private final long value;

	private final String relation;

	// ---------------------------------------------------------------------------------------------

	private TotalUserProfiles(Builder builder) {

		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");
		this.relation = ApiTypeHelper.requireNonNull(builder.relation, this, "relation");

	}

	public static TotalUserProfiles of(Function<Builder, ObjectBuilder<TotalUserProfiles>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final long value() {
		return this.value;
	}

	/**
	 * Required - API name: {@code relation}
	 */
	public final String relation() {
		return this.relation;
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

		generator.writeKey("value");
		generator.write(this.value);

		generator.writeKey("relation");
		generator.write(this.relation);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TotalUserProfiles}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TotalUserProfiles> {
		private Long value;

		private String relation;

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(long value) {
			this.value = value;
			return this;
		}

		/**
		 * Required - API name: {@code relation}
		 */
		public final Builder relation(String value) {
			this.relation = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TotalUserProfiles}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TotalUserProfiles build() {
			_checkSingleUse();

			return new TotalUserProfiles(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TotalUserProfiles}
	 */
	public static final JsonpDeserializer<TotalUserProfiles> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TotalUserProfiles::setupTotalUserProfilesDeserializer);

	protected static void setupTotalUserProfilesDeserializer(ObjectDeserializer<TotalUserProfiles.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.longDeserializer(), "value");
		op.add(Builder::relation, JsonpDeserializer.stringDeserializer(), "relation");

	}

}
