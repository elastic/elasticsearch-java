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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch.xpack.usage.SecurityRolesDls;
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

// typedef: security._types.RolesStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.RolesStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class RolesStats implements JsonpSerializable {
	private final SecurityRolesDls dls;

	// ---------------------------------------------------------------------------------------------

	private RolesStats(Builder builder) {

		this.dls = ApiTypeHelper.requireNonNull(builder.dls, this, "dls");

	}

	public static RolesStats of(Function<Builder, ObjectBuilder<RolesStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Document-level security (DLS) statistics.
	 * <p>
	 * API name: {@code dls}
	 */
	public final SecurityRolesDls dls() {
		return this.dls;
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

		generator.writeKey("dls");
		this.dls.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RolesStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RolesStats> {
		private SecurityRolesDls dls;

		/**
		 * Required - Document-level security (DLS) statistics.
		 * <p>
		 * API name: {@code dls}
		 */
		public final Builder dls(SecurityRolesDls value) {
			this.dls = value;
			return this;
		}

		/**
		 * Required - Document-level security (DLS) statistics.
		 * <p>
		 * API name: {@code dls}
		 */
		public final Builder dls(Function<SecurityRolesDls.Builder, ObjectBuilder<SecurityRolesDls>> fn) {
			return this.dls(fn.apply(new SecurityRolesDls.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RolesStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RolesStats build() {
			_checkSingleUse();

			return new RolesStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RolesStats}
	 */
	public static final JsonpDeserializer<RolesStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RolesStats::setupRolesStatsDeserializer);

	protected static void setupRolesStatsDeserializer(ObjectDeserializer<RolesStats.Builder> op) {

		op.add(Builder::dls, SecurityRolesDls._DESERIALIZER, "dls");

	}

}
