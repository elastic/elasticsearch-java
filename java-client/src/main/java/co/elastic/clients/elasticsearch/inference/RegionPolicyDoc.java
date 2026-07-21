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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
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

// typedef: inference._types.RegionPolicyDoc

/**
 * The stored region policy document.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.RegionPolicyDoc">API
 *      specification</a>
 */

public abstract class RegionPolicyDoc implements JsonpSerializable {
	private final RegionPolicy regionPolicy;

	private final DateTime createdAt;

	@Nullable
	private final String createdBy;

	@Nullable
	private final DateTime updatedAt;

	@Nullable
	private final String updatedBy;

	// ---------------------------------------------------------------------------------------------

	protected RegionPolicyDoc(AbstractBuilder<?> builder) {

		this.regionPolicy = ApiTypeHelper.requireNonNull(builder.regionPolicy, this, "regionPolicy");
		this.createdAt = ApiTypeHelper.requireNonNull(builder.createdAt, this, "createdAt");
		this.createdBy = builder.createdBy;
		this.updatedAt = builder.updatedAt;
		this.updatedBy = builder.updatedBy;

	}

	/**
	 * Required - API name: {@code region_policy}
	 */
	public final RegionPolicy regionPolicy() {
		return this.regionPolicy;
	}

	/**
	 * Required - The date and time the region policy was created.
	 * <p>
	 * API name: {@code created_at}
	 */
	public final DateTime createdAt() {
		return this.createdAt;
	}

	/**
	 * The user who created the region policy.
	 * <p>
	 * API name: {@code created_by}
	 */
	@Nullable
	public final String createdBy() {
		return this.createdBy;
	}

	/**
	 * The date and time the region policy was last updated.
	 * <p>
	 * API name: {@code updated_at}
	 */
	@Nullable
	public final DateTime updatedAt() {
		return this.updatedAt;
	}

	/**
	 * The user who last updated the region policy.
	 * <p>
	 * API name: {@code updated_by}
	 */
	@Nullable
	public final String updatedBy() {
		return this.updatedBy;
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

		generator.writeKey("region_policy");
		this.regionPolicy.serialize(generator, mapper);

		generator.writeKey("created_at");
		this.createdAt.serialize(generator, mapper);
		if (this.createdBy != null) {
			generator.writeKey("created_by");
			generator.write(this.createdBy);

		}
		if (this.updatedAt != null) {
			generator.writeKey("updated_at");
			this.updatedAt.serialize(generator, mapper);
		}
		if (this.updatedBy != null) {
			generator.writeKey("updated_by");
			generator.write(this.updatedBy);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private RegionPolicy regionPolicy;

		private DateTime createdAt;

		@Nullable
		private String createdBy;

		@Nullable
		private DateTime updatedAt;

		@Nullable
		private String updatedBy;

		/**
		 * Required - API name: {@code region_policy}
		 */
		public final BuilderT regionPolicy(RegionPolicy value) {
			this.regionPolicy = value;
			return self();
		}

		/**
		 * Required - API name: {@code region_policy}
		 */
		public final BuilderT regionPolicy(Function<RegionPolicy.Builder, ObjectBuilder<RegionPolicy>> fn) {
			return this.regionPolicy(fn.apply(new RegionPolicy.Builder()).build());
		}

		/**
		 * Required - API name: {@code region_policy}
		 */
		public final BuilderT regionPolicy(RegionPolicyVariant value) {
			this.regionPolicy = value._toRegionPolicy();
			return self();
		}

		/**
		 * Required - The date and time the region policy was created.
		 * <p>
		 * API name: {@code created_at}
		 */
		public final BuilderT createdAt(DateTime value) {
			this.createdAt = value;
			return self();
		}

		/**
		 * The user who created the region policy.
		 * <p>
		 * API name: {@code created_by}
		 */
		public final BuilderT createdBy(@Nullable String value) {
			this.createdBy = value;
			return self();
		}

		/**
		 * The date and time the region policy was last updated.
		 * <p>
		 * API name: {@code updated_at}
		 */
		public final BuilderT updatedAt(@Nullable DateTime value) {
			this.updatedAt = value;
			return self();
		}

		/**
		 * The user who last updated the region policy.
		 * <p>
		 * API name: {@code updated_by}
		 */
		public final BuilderT updatedBy(@Nullable String value) {
			this.updatedBy = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRegionPolicyDocDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::regionPolicy, RegionPolicy._DESERIALIZER, "region_policy");
		op.add(AbstractBuilder::createdAt, DateTime._DESERIALIZER, "created_at");
		op.add(AbstractBuilder::createdBy, JsonpDeserializer.stringDeserializer(), "created_by");
		op.add(AbstractBuilder::updatedAt, DateTime._DESERIALIZER, "updated_at");
		op.add(AbstractBuilder::updatedBy, JsonpDeserializer.stringDeserializer(), "updated_by");

	}

}
