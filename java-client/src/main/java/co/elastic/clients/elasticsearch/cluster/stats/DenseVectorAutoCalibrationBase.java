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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.elasticsearch.indices.segments.SegmentAutoCalibrationBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;

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

// typedef: cluster.stats.DenseVectorAutoCalibrationBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.DenseVectorAutoCalibrationBase">API
 *      specification</a>
 */

public abstract class DenseVectorAutoCalibrationBase extends SegmentAutoCalibrationBase {
	private final int numberOfSegments;

	// ---------------------------------------------------------------------------------------------

	protected DenseVectorAutoCalibrationBase(AbstractBuilder<?> builder) {
		super(builder);

		this.numberOfSegments = ApiTypeHelper.requireNonNull(builder.numberOfSegments, this, "numberOfSegments", 0);

	}

	/**
	 * Required - The number of segments that share these parameters.
	 * <p>
	 * API name: {@code number_of_segments}
	 */
	public final int numberOfSegments() {
		return this.numberOfSegments;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("number_of_segments");
		generator.write(this.numberOfSegments);

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				SegmentAutoCalibrationBase.AbstractBuilder<BuilderT> {
		private Integer numberOfSegments;

		/**
		 * Required - The number of segments that share these parameters.
		 * <p>
		 * API name: {@code number_of_segments}
		 */
		public final BuilderT numberOfSegments(int value) {
			this.numberOfSegments = value;
			return self();
		}

		protected AbstractBuilder() {
		}

		protected AbstractBuilder(DenseVectorAutoCalibrationBase instance) {
			super(instance);
			this.numberOfSegments = instance.numberOfSegments;

		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDenseVectorAutoCalibrationBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		SegmentAutoCalibrationBase.setupSegmentAutoCalibrationBaseDeserializer(op);
		op.add(AbstractBuilder::numberOfSegments, JsonpDeserializer.integerDeserializer(), "number_of_segments");

	}

}
