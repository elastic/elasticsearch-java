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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: xpack.usage.DataTiers

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.DataTiers">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataTiers extends Base {
	private final DataTierPhaseStatistics dataWarm;

	@Nullable
	private final DataTierPhaseStatistics dataFrozen;

	private final DataTierPhaseStatistics dataCold;

	private final DataTierPhaseStatistics dataContent;

	private final DataTierPhaseStatistics dataHot;

	// ---------------------------------------------------------------------------------------------

	private DataTiers(Builder builder) {
		super(builder);

		this.dataWarm = ApiTypeHelper.requireNonNull(builder.dataWarm, this, "dataWarm");
		this.dataFrozen = builder.dataFrozen;
		this.dataCold = ApiTypeHelper.requireNonNull(builder.dataCold, this, "dataCold");
		this.dataContent = ApiTypeHelper.requireNonNull(builder.dataContent, this, "dataContent");
		this.dataHot = ApiTypeHelper.requireNonNull(builder.dataHot, this, "dataHot");

	}

	public static DataTiers of(Function<Builder, ObjectBuilder<DataTiers>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code data_warm}
	 */
	public final DataTierPhaseStatistics dataWarm() {
		return this.dataWarm;
	}

	/**
	 * API name: {@code data_frozen}
	 */
	@Nullable
	public final DataTierPhaseStatistics dataFrozen() {
		return this.dataFrozen;
	}

	/**
	 * Required - API name: {@code data_cold}
	 */
	public final DataTierPhaseStatistics dataCold() {
		return this.dataCold;
	}

	/**
	 * Required - API name: {@code data_content}
	 */
	public final DataTierPhaseStatistics dataContent() {
		return this.dataContent;
	}

	/**
	 * Required - API name: {@code data_hot}
	 */
	public final DataTierPhaseStatistics dataHot() {
		return this.dataHot;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("data_warm");
		this.dataWarm.serialize(generator, mapper);

		if (this.dataFrozen != null) {
			generator.writeKey("data_frozen");
			this.dataFrozen.serialize(generator, mapper);

		}
		generator.writeKey("data_cold");
		this.dataCold.serialize(generator, mapper);

		generator.writeKey("data_content");
		this.dataContent.serialize(generator, mapper);

		generator.writeKey("data_hot");
		this.dataHot.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataTiers}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<DataTiers> {
		private DataTierPhaseStatistics dataWarm;

		@Nullable
		private DataTierPhaseStatistics dataFrozen;

		private DataTierPhaseStatistics dataCold;

		private DataTierPhaseStatistics dataContent;

		private DataTierPhaseStatistics dataHot;

		/**
		 * Required - API name: {@code data_warm}
		 */
		public final Builder dataWarm(DataTierPhaseStatistics value) {
			this.dataWarm = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_warm}
		 */
		public final Builder dataWarm(
				Function<DataTierPhaseStatistics.Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
			return this.dataWarm(fn.apply(new DataTierPhaseStatistics.Builder()).build());
		}

		/**
		 * API name: {@code data_frozen}
		 */
		public final Builder dataFrozen(@Nullable DataTierPhaseStatistics value) {
			this.dataFrozen = value;
			return this;
		}

		/**
		 * API name: {@code data_frozen}
		 */
		public final Builder dataFrozen(
				Function<DataTierPhaseStatistics.Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
			return this.dataFrozen(fn.apply(new DataTierPhaseStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code data_cold}
		 */
		public final Builder dataCold(DataTierPhaseStatistics value) {
			this.dataCold = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_cold}
		 */
		public final Builder dataCold(
				Function<DataTierPhaseStatistics.Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
			return this.dataCold(fn.apply(new DataTierPhaseStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code data_content}
		 */
		public final Builder dataContent(DataTierPhaseStatistics value) {
			this.dataContent = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_content}
		 */
		public final Builder dataContent(
				Function<DataTierPhaseStatistics.Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
			return this.dataContent(fn.apply(new DataTierPhaseStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code data_hot}
		 */
		public final Builder dataHot(DataTierPhaseStatistics value) {
			this.dataHot = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_hot}
		 */
		public final Builder dataHot(
				Function<DataTierPhaseStatistics.Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
			return this.dataHot(fn.apply(new DataTierPhaseStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataTiers}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataTiers build() {
			_checkSingleUse();

			return new DataTiers(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataTiers}
	 */
	public static final JsonpDeserializer<DataTiers> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DataTiers::setupDataTiersDeserializer);

	protected static void setupDataTiersDeserializer(ObjectDeserializer<DataTiers.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::dataWarm, DataTierPhaseStatistics._DESERIALIZER, "data_warm");
		op.add(Builder::dataFrozen, DataTierPhaseStatistics._DESERIALIZER, "data_frozen");
		op.add(Builder::dataCold, DataTierPhaseStatistics._DESERIALIZER, "data_cold");
		op.add(Builder::dataContent, DataTierPhaseStatistics._DESERIALIZER, "data_content");
		op.add(Builder::dataHot, DataTierPhaseStatistics._DESERIALIZER, "data_hot");

	}

}
