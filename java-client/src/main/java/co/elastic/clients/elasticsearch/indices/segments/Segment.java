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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
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

// typedef: indices.segments.Segment

/**
 *
 * @see <a href="../../doc-files/api-spec.html#indices.segments.Segment">API
 *      specification</a>
 */
@JsonpDeserializable
public class Segment implements JsonpSerializable {
	private final Map<String, String> attributes;

	private final boolean committed;

	@Nullable
	private final Boolean compound;

	private final long deletedDocs;

	private final int generation;

	private final boolean search;

	@Nullable
	private final String mergeId;

	private final List<SegmentSort> sort;

	@Nullable
	private final String size;

	private final double sizeInBytes;

	private final long numDocs;

	@Nullable
	private final String version;

	private final Map<String, SegmentAutoCalibration> autoCalibration;

	// ---------------------------------------------------------------------------------------------

	private Segment(Builder builder) {

		this.attributes = ApiTypeHelper.unmodifiable(builder.attributes);
		this.committed = ApiTypeHelper.requireNonNull(builder.committed, this, "committed", false);
		this.compound = builder.compound;
		this.deletedDocs = ApiTypeHelper.requireNonNull(builder.deletedDocs, this, "deletedDocs", 0);
		this.generation = ApiTypeHelper.requireNonNull(builder.generation, this, "generation", 0);
		this.search = ApiTypeHelper.requireNonNull(builder.search, this, "search", false);
		this.mergeId = builder.mergeId;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.size = builder.size;
		this.sizeInBytes = ApiTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes", 0);
		this.numDocs = ApiTypeHelper.requireNonNull(builder.numDocs, this, "numDocs", 0);
		this.version = builder.version;
		this.autoCalibration = ApiTypeHelper.unmodifiable(builder.autoCalibration);

	}

	public static Segment of(Function<Builder, ObjectBuilder<Segment>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Contains information about whether high compression was enabled and per-field
	 * vector formats.
	 * <p>
	 * API name: {@code attributes}
	 */
	public final Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * Required - If <code>true</code>, the segment is synced to disk. Segments that
	 * are synced can survive a hard reboot. If <code>false</code>, the data from
	 * uncommitted segments is also stored in the transaction log so that
	 * Elasticsearch is able to replay changes on the next start.
	 * <p>
	 * API name: {@code committed}
	 */
	public final boolean committed() {
		return this.committed;
	}

	/**
	 * If <code>true</code>, Lucene merged all files from the segment into a single
	 * file to save file descriptors.
	 * <p>
	 * API name: {@code compound}
	 */
	@Nullable
	public final Boolean compound() {
		return this.compound;
	}

	/**
	 * Required - The number of deleted documents as reported by Lucene, which may
	 * be higher or lower than the number of delete operations you have performed.
	 * This number excludes deletes that were performed recently and do not yet
	 * belong to a segment. Deleted documents are cleaned up by the automatic merge
	 * process if it makes sense to do so. Also, Elasticsearch creates extra deleted
	 * documents to internally track the recent history of operations on a shard.
	 * <p>
	 * API name: {@code deleted_docs}
	 */
	public final long deletedDocs() {
		return this.deletedDocs;
	}

	/**
	 * Required - Generation number, such as <code>0</code>. Elasticsearch
	 * increments this generation number for each segment written then uses this
	 * number to derive the segment name.
	 * <p>
	 * API name: {@code generation}
	 */
	public final int generation() {
		return this.generation;
	}

	/**
	 * Required - If <code>true</code>, the segment is searchable. If
	 * <code>false</code>, the segment has most likely been written to disk but
	 * needs a refresh to be searchable.
	 * <p>
	 * API name: {@code search}
	 */
	public final boolean search() {
		return this.search;
	}

	/**
	 * The ID of the merge the segment is part of. Only returned while the segment
	 * is being merged.
	 * <p>
	 * API name: {@code merge_id}
	 */
	@Nullable
	public final String mergeId() {
		return this.mergeId;
	}

	/**
	 * The index sort of the segment. Only returned when the index is sorted.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<SegmentSort> sort() {
		return this.sort;
	}

	/**
	 * Disk space used by the segment.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final String size() {
		return this.size;
	}

	/**
	 * Required - Disk space used by the segment, in bytes.
	 * <p>
	 * API name: {@code size_in_bytes}
	 */
	public final double sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * Required - The number of documents as reported by Lucene. This excludes
	 * deleted documents and counts any nested documents separately from their
	 * parents. It also excludes documents which were indexed recently and do not
	 * yet belong to a segment.
	 * <p>
	 * API name: {@code num_docs}
	 */
	public final long numDocs() {
		return this.numDocs;
	}

	/**
	 * Version of Lucene used to write the segment.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * The auto-calibration information of the segment, per
	 * <code>dense_vector</code> field that supports auto-calibration. Only returned
	 * when <code>include_auto_calibration</code> is <code>true</code>.
	 * <p>
	 * API name: {@code auto_calibration}
	 */
	public final Map<String, SegmentAutoCalibration> autoCalibration() {
		return this.autoCalibration;
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

		if (ApiTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("committed");
		generator.write(this.committed);

		if (this.compound != null) {
			generator.writeKey("compound");
			generator.write(this.compound);

		}
		generator.writeKey("deleted_docs");
		generator.write(this.deletedDocs);

		generator.writeKey("generation");
		generator.write(this.generation);

		generator.writeKey("search");
		generator.write(this.search);

		if (this.mergeId != null) {
			generator.writeKey("merge_id");
			generator.write(this.mergeId);

		}
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SegmentSort item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

		generator.writeKey("num_docs");
		generator.write(this.numDocs);

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (ApiTypeHelper.isDefined(this.autoCalibration)) {
			generator.writeKey("auto_calibration");
			generator.writeStartObject();
			for (Map.Entry<String, SegmentAutoCalibration> item0 : this.autoCalibration.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link Segment}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Segment> {
		@Nullable
		private Map<String, String> attributes;

		private Boolean committed;

		@Nullable
		private Boolean compound;

		private Long deletedDocs;

		private Integer generation;

		private Boolean search;

		@Nullable
		private String mergeId;

		@Nullable
		private List<SegmentSort> sort;

		@Nullable
		private String size;

		private Double sizeInBytes;

		private Long numDocs;

		@Nullable
		private String version;

		@Nullable
		private Map<String, SegmentAutoCalibration> autoCalibration;

		public Builder() {
		}
		private Builder(Segment instance) {
			this.attributes = instance.attributes;
			this.committed = instance.committed;
			this.compound = instance.compound;
			this.deletedDocs = instance.deletedDocs;
			this.generation = instance.generation;
			this.search = instance.search;
			this.mergeId = instance.mergeId;
			this.sort = instance.sort;
			this.size = instance.size;
			this.sizeInBytes = instance.sizeInBytes;
			this.numDocs = instance.numDocs;
			this.version = instance.version;
			this.autoCalibration = instance.autoCalibration;

		}
		/**
		 * Contains information about whether high compression was enabled and per-field
		 * vector formats.
		 * <p>
		 * API name: {@code attributes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>attributes</code>.
		 */
		public final Builder attributes(Map<String, String> map) {
			this.attributes = _mapPutAll(this.attributes, map);
			return this;
		}

		/**
		 * Contains information about whether high compression was enabled and per-field
		 * vector formats.
		 * <p>
		 * API name: {@code attributes}
		 * <p>
		 * Adds an entry to <code>attributes</code>.
		 */
		public final Builder attributes(String key, String value) {
			this.attributes = _mapPut(this.attributes, key, value);
			return this;
		}

		/**
		 * Required - If <code>true</code>, the segment is synced to disk. Segments that
		 * are synced can survive a hard reboot. If <code>false</code>, the data from
		 * uncommitted segments is also stored in the transaction log so that
		 * Elasticsearch is able to replay changes on the next start.
		 * <p>
		 * API name: {@code committed}
		 */
		public final Builder committed(boolean value) {
			this.committed = value;
			return this;
		}

		/**
		 * If <code>true</code>, Lucene merged all files from the segment into a single
		 * file to save file descriptors.
		 * <p>
		 * API name: {@code compound}
		 */
		public final Builder compound(@Nullable Boolean value) {
			this.compound = value;
			return this;
		}

		/**
		 * Required - The number of deleted documents as reported by Lucene, which may
		 * be higher or lower than the number of delete operations you have performed.
		 * This number excludes deletes that were performed recently and do not yet
		 * belong to a segment. Deleted documents are cleaned up by the automatic merge
		 * process if it makes sense to do so. Also, Elasticsearch creates extra deleted
		 * documents to internally track the recent history of operations on a shard.
		 * <p>
		 * API name: {@code deleted_docs}
		 */
		public final Builder deletedDocs(long value) {
			this.deletedDocs = value;
			return this;
		}

		/**
		 * Required - Generation number, such as <code>0</code>. Elasticsearch
		 * increments this generation number for each segment written then uses this
		 * number to derive the segment name.
		 * <p>
		 * API name: {@code generation}
		 */
		public final Builder generation(int value) {
			this.generation = value;
			return this;
		}

		/**
		 * Required - If <code>true</code>, the segment is searchable. If
		 * <code>false</code>, the segment has most likely been written to disk but
		 * needs a refresh to be searchable.
		 * <p>
		 * API name: {@code search}
		 */
		public final Builder search(boolean value) {
			this.search = value;
			return this;
		}

		/**
		 * The ID of the merge the segment is part of. Only returned while the segment
		 * is being merged.
		 * <p>
		 * API name: {@code merge_id}
		 */
		public final Builder mergeId(@Nullable String value) {
			this.mergeId = value;
			return this;
		}

		/**
		 * The index sort of the segment. Only returned when the index is sorted.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<SegmentSort> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * The index sort of the segment. Only returned when the index is sorted.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(SegmentSort value, SegmentSort... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * The index sort of the segment. Only returned when the index is sorted.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SegmentSort.Builder, ObjectBuilder<SegmentSort>> fn) {
			return sort(fn.apply(new SegmentSort.Builder()).build());
		}

		/**
		 * Disk space used by the segment.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * Required - Disk space used by the segment, in bytes.
		 * <p>
		 * API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(double value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * Required - The number of documents as reported by Lucene. This excludes
		 * deleted documents and counts any nested documents separately from their
		 * parents. It also excludes documents which were indexed recently and do not
		 * yet belong to a segment.
		 * <p>
		 * API name: {@code num_docs}
		 */
		public final Builder numDocs(long value) {
			this.numDocs = value;
			return this;
		}

		/**
		 * Version of Lucene used to write the segment.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * The auto-calibration information of the segment, per
		 * <code>dense_vector</code> field that supports auto-calibration. Only returned
		 * when <code>include_auto_calibration</code> is <code>true</code>.
		 * <p>
		 * API name: {@code auto_calibration}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>autoCalibration</code>.
		 */
		public final Builder autoCalibration(Map<String, SegmentAutoCalibration> map) {
			this.autoCalibration = _mapPutAll(this.autoCalibration, map);
			return this;
		}

		/**
		 * The auto-calibration information of the segment, per
		 * <code>dense_vector</code> field that supports auto-calibration. Only returned
		 * when <code>include_auto_calibration</code> is <code>true</code>.
		 * <p>
		 * API name: {@code auto_calibration}
		 * <p>
		 * Adds an entry to <code>autoCalibration</code>.
		 */
		public final Builder autoCalibration(String key, SegmentAutoCalibration value) {
			this.autoCalibration = _mapPut(this.autoCalibration, key, value);
			return this;
		}

		/**
		 * The auto-calibration information of the segment, per
		 * <code>dense_vector</code> field that supports auto-calibration. Only returned
		 * when <code>include_auto_calibration</code> is <code>true</code>.
		 * <p>
		 * API name: {@code auto_calibration}
		 * <p>
		 * Adds an entry to <code>autoCalibration</code> using a builder lambda.
		 */
		public final Builder autoCalibration(String key,
				Function<SegmentAutoCalibration.Builder, ObjectBuilder<SegmentAutoCalibration>> fn) {
			return autoCalibration(key, fn.apply(new SegmentAutoCalibration.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Segment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Segment build() {
			_checkSingleUse();

			return new Segment(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Segment}
	 */
	public static final JsonpDeserializer<Segment> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Segment::setupSegmentDeserializer);

	protected static void setupSegmentDeserializer(ObjectDeserializer<Segment.Builder> op) {

		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::committed, JsonpDeserializer.booleanDeserializer(), "committed");
		op.add(Builder::compound, JsonpDeserializer.booleanDeserializer(), "compound");
		op.add(Builder::deletedDocs, JsonpDeserializer.longDeserializer(), "deleted_docs");
		op.add(Builder::generation, JsonpDeserializer.integerDeserializer(), "generation");
		op.add(Builder::search, JsonpDeserializer.booleanDeserializer(), "search");
		op.add(Builder::mergeId, JsonpDeserializer.stringDeserializer(), "merge_id");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SegmentSort._DESERIALIZER), "sort");
		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::sizeInBytes, JsonpDeserializer.doubleDeserializer(), "size_in_bytes");
		op.add(Builder::numDocs, JsonpDeserializer.longDeserializer(), "num_docs");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::autoCalibration, JsonpDeserializer.stringMapDeserializer(SegmentAutoCalibration._DESERIALIZER),
				"auto_calibration");

	}

}
