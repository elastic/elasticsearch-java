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

package co.elastic.clients.elasticsearch.indices.segments;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
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

// typedef: indices.segments.SegmentAutoCalibrationBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.segments.SegmentAutoCalibrationBase">API
 *      specification</a>
 */

public abstract class SegmentAutoCalibrationBase implements JsonpSerializable {
	private final boolean calibrated;

	private final long numberOfVectors;

	@Nullable
	private final String size;

	private final long sizeInBytes;

	// ---------------------------------------------------------------------------------------------

	protected SegmentAutoCalibrationBase(AbstractBuilder<?> builder) {

		this.calibrated = ApiTypeHelper.requireNonNull(builder.calibrated, this, "calibrated", false);
		this.numberOfVectors = ApiTypeHelper.requireNonNull(builder.numberOfVectors, this, "numberOfVectors", 0);
		this.size = builder.size;
		this.sizeInBytes = ApiTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes", 0);

	}

	/**
	 * Required - If <code>true</code>, the segment has been calibrated, and
	 * <code>parameters</code> is present.
	 * <p>
	 * API name: {@code calibrated}
	 */
	public final boolean calibrated() {
		return this.calibrated;
	}

	/**
	 * Required - The number of vectors of the field in the segment.
	 * <p>
	 * API name: {@code number_of_vectors}
	 */
	public final long numberOfVectors() {
		return this.numberOfVectors;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final String size() {
		return this.size;
	}

	/**
	 * Required - The size of the vectors of the field in the segment, in bytes.
	 * <p>
	 * API name: {@code size_in_bytes}
	 */
	public final long sizeInBytes() {
		return this.sizeInBytes;
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

		generator.writeKey("calibrated");
		generator.write(this.calibrated);

		generator.writeKey("number_of_vectors");
		generator.write(this.numberOfVectors);

		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private Boolean calibrated;

		private Long numberOfVectors;

		@Nullable
		private String size;

		private Long sizeInBytes;

		/**
		 * Required - If <code>true</code>, the segment has been calibrated, and
		 * <code>parameters</code> is present.
		 * <p>
		 * API name: {@code calibrated}
		 */
		public final BuilderT calibrated(boolean value) {
			this.calibrated = value;
			return self();
		}

		/**
		 * Required - The number of vectors of the field in the segment.
		 * <p>
		 * API name: {@code number_of_vectors}
		 */
		public final BuilderT numberOfVectors(long value) {
			this.numberOfVectors = value;
			return self();
		}

		/**
		 * API name: {@code size}
		 */
		public final BuilderT size(@Nullable String value) {
			this.size = value;
			return self();
		}

		/**
		 * Required - The size of the vectors of the field in the segment, in bytes.
		 * <p>
		 * API name: {@code size_in_bytes}
		 */
		public final BuilderT sizeInBytes(long value) {
			this.sizeInBytes = value;
			return self();
		}

		protected AbstractBuilder() {
		}

		protected AbstractBuilder(SegmentAutoCalibrationBase instance) {
			this.calibrated = instance.calibrated;
			this.numberOfVectors = instance.numberOfVectors;
			this.size = instance.size;
			this.sizeInBytes = instance.sizeInBytes;

		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupSegmentAutoCalibrationBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::calibrated, JsonpDeserializer.booleanDeserializer(), "calibrated");
		op.add(AbstractBuilder::numberOfVectors, JsonpDeserializer.longDeserializer(), "number_of_vectors");
		op.add(AbstractBuilder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(AbstractBuilder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");

	}

}
